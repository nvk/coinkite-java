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

package com.coinkite.auth;

import feign.RequestInterceptor;
import feign.RequestTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Base64;

/**
 * <a href="https://docs.coinkite.com/api/auth.html#how-to-authorize-requests">https://docs.coinkite.com/api/auth.html#how-to-authorize-requests</a><br />
 * /v1/endpoint|&lt;timestamp&gt;
 */
public class CoinkiteSigningRequestInterceptor implements RequestInterceptor {

    Logger logger = LoggerFactory.getLogger(CoinkiteSigningRequestInterceptor.class);

    public static final String X_CK_SIGN = "X-CK-Sign";
    public static final String X_CK_TIMESTAMP = "X-CK-Timestamp";
    private static final String HMAC_SHA512_ALG = "HmacSHA256";

    @Override
    public void apply(RequestTemplate template) {

        template.url();
        SecretKeySpec signingKey = new SecretKeySpec("private-key".getBytes(), HMAC_SHA512_ALG);
        try {

            Mac mac = Mac.getInstance(HMAC_SHA512_ALG);
            mac.init(signingKey);

            String ts = LocalDateTime.now().format(DateTimeFormatter.ISO_DATE_TIME);

            byte[] bytes = mac.doFinal(getData(ts));
            String encoded = Base64.getEncoder().encodeToString(bytes);

            template.header(X_CK_SIGN, encoded);
            template.header(X_CK_TIMESTAMP, ts);

        } catch (NoSuchAlgorithmException e) {
            logger.error("Incorrect crypto algorithm specified", e);
        } catch (InvalidKeyException e) {
            logger.error("Invalid SigningKey specified", e);
        }


    }

    private byte[] getData(String ts) {

        String data = "endpoint" + "|" + ts;

        return data.getBytes();
    }
}
