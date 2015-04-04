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

import com.coinkite.CoinkiteErrorResponseDecoder;
import feign.Response;
import feign.RetryableException;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.HashMap;

import static org.junit.Assert.assertTrue;

@RunWith(MockitoJUnitRunner.class)
public class CoinkiteErrorResponseDecoderTest {

    private CoinkiteErrorResponseDecoder decoder;

    Response response;

    @Before
    public void setup() {

        decoder = new CoinkiteErrorResponseDecoder();
    }

    @Test
    public void retryOn429() {

        response = Response.create(429, "Too Many Requests", new HashMap<>(),
                new String("{\n" +
                        "  \"help_msg\": \"Responses are being rate-limited: min gap time 2s\",\n" +
                        "  \"message\": \"Too Many Requests\",\n" +
                        "  \"status\": 429,\n" +
                        "  \"wait_time\": 1.759\n" +
                        "}").getBytes());
        boolean threw = false;

        try{
            decoder.decode("GET", response);
        } catch(RetryableException re) {
            threw = true;
        }

        assertTrue(threw);


    }
}