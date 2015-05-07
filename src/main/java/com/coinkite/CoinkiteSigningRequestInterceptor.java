/*
 *  The MIT License (MIT)
 *
 *  Copyright (c) 2015. Coin Craze Technologies, LLC
 *
 *  Permission is hereby granted, free of charge, to any person obtaining a copy
 *  of this software and associated documentation files (the "Software"), to deal
 *  in the Software without restriction, including without limitation the rights
 *  to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 *  copies of the Software, and to permit persons to whom the Software is
 *  furnished to do so, subject to the following conditions:
 *
 *  The above copyright notice and this permission notice shall be included in all
 *  copies or substantial portions of the Software.
 *
 *  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 *  IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 *  FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 *  AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 *  LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 *  OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 *  SOFTWARE.
 */

package com.coinkite;

import feign.RequestInterceptor;
import feign.RequestTemplate;
import org.apache.commons.codec.binary.Hex;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.time.Clock;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Optional;

import static com.coinkite.Constants.*;
import static java.time.format.DateTimeFormatter.ISO_DATE_TIME;
import static java.util.Optional.ofNullable;

/**
 * <a href="https://docs.coinkite.com/api/auth.html#how-to-authorize-requests">https://docs.coinkite.com/api/auth.html#how-to-authorize-requests</a><br />
 * /v1/endpoint|&lt;timestamp&gt;
 */
public class CoinkiteSigningRequestInterceptor implements RequestInterceptor {

    Logger logger = LoggerFactory.getLogger(CoinkiteSigningRequestInterceptor.class);
    private LocalDateTime dateTime;

    @Override
    public void apply(RequestTemplate template) {

        try {

            String[] result = createSigAndTimestamp(template.url());

            template.header(X_CK_SIGN, result[0]);
            template.header(X_CK_TIMESTAMP, result[1]);

        } catch (NoSuchAlgorithmException e) {
            logger.error("Incorrect crypto algorithm specified", e);
        } catch (InvalidKeyException e) {
            logger.error("Invalid SigningKey specified", e);
        }


    }

    private byte[] getData(String urlOrEndpoint, String ts) {

        String data = urlOrEndpoint + "|" + ts;

        return data.getBytes(StandardCharsets.UTF_8);
    }


    protected String getApiSecret() {

        Optional<String> secret = ofNullable(System.getenv(Constants.X_CK_SIGN));

        if(!secret.isPresent()) {
            secret = ofNullable(System.getProperty(Constants.X_CK_SIGN));
        }

        return secret.orElseThrow(() -> new RuntimeException("Coinkite secret was not passed in as a jvm arg or set on env."));
    }

    void setDateTime(LocalDateTime dateTime) {

        this.dateTime = dateTime;
    }

    LocalDateTime getDateTime() {

        if(dateTime == null) {
            return LocalDateTime.now(Clock.system(ZoneId.of("UTC")));
        }

        return dateTime;
    }

    public String[] createSigAndTimestamp(String url) throws NoSuchAlgorithmException, InvalidKeyException {
        String apiSecret = getApiSecret();
        SecretKeySpec signingKey = new SecretKeySpec(apiSecret.getBytes(StandardCharsets.UTF_8), HMAC_SHA512_ALG);

        Mac mac = Mac.getInstance(HMAC_SHA512_ALG);
        mac.init(signingKey);

        String ts = getDateTime().format(ISO_DATE_TIME);

        byte[] bytes = mac.doFinal(getData(url, ts));
        String encoded = Hex.encodeHexString(bytes);

        return new String[] {encoded, ts};
    }

    public static void main(String[] args) {

        CoinkiteSigningRequestInterceptor coinkiteSigningRequestInterceptor = new CoinkiteSigningRequestInterceptor();
        try {
            String[] strings = coinkiteSigningRequestInterceptor.createSigAndTimestamp("/v1/pubnub/send");
            System.out.println(strings[0]);
            System.out.println(strings[1]);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (InvalidKeyException e) {
            e.printStackTrace();
        }
    }
}
