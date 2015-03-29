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


import com.coinkite.Constants;
import com.coinkite.EnvironmentUtility;
import feign.RequestTemplate;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

/**
 * <a href="https://docs.coinkite.com/api/auth.html#sample-output">https://docs.coinkite.com/api/auth.html#sample-output</a>
 */
public class CoinkiteSigningRequestInterceptorTest {

    private static final String API_SECRET = "this-is-my-secret";

    @Before
    public void setup() throws Exception {

        EnvironmentUtility.set(Constants.X_CK_SIGN, API_SECRET);
    }

    @Test
    public void doesAPISecretGetRead() {

        String apiSecret = new CoinkiteSigningRequestInterceptor().getApiSecret();

        assertEquals(API_SECRET, apiSecret);
    }

    @Test
    public void testSecretCorrectlySigns() {

        LocalDateTime dateTime = LocalDateTime.from(DateTimeFormatter.ISO_DATE_TIME.parse("2014-06-03T17:48:47.774453"));

        CoinkiteSigningRequestInterceptor coinkiteSigningRequestInterceptor = new CoinkiteSigningRequestInterceptor(dateTime);

        RequestTemplate template = new RequestTemplate()
                .method("GET")
                .append("/example/endpoint");

        coinkiteSigningRequestInterceptor.apply(template);

        Collection<String> collection = template.headers().get(Constants.X_CK_TIMESTAMP);
        assertEquals(collection.iterator().next(), "2014-06-03T17:48:47.774453");
        collection = template.headers().get(Constants.X_CK_SIGN);
        assertEquals("042341c271b14aaad1c898d35c9ca0bc8552e1cb4d6683f28edd57e3e86ed76c", collection.iterator().next());
    }

}