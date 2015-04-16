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


import com.coinkite.api.RestError;
import feign.Response;
import feign.RetryableException;
import feign.codec.ErrorDecoder;
import feign.jackson.JacksonDecoder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigDecimal;
import java.util.Date;

public class CoinkiteErrorResponseDecoder implements ErrorDecoder {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    private ErrorDecoder defaultEncoder = new ErrorDecoder.Default();
    private JacksonDecoder decoder = new JacksonDecoder();

    @Override
    public Exception decode(String methodKey, Response response) {

        RestError restError = null;
        try {
            restError = (RestError) decoder.decode(response, RestError.class);
        } catch (Exception e) {
            e.printStackTrace();
        }

        if(restError != null) {
            if (response.status() == 429) throw new RetryableException(restError.getMessage(), createRetryAfter(restError.getWaitTime()));

            if(response.status() == 400) throw new IllegalArgumentException(restError.getMessage());

            if(response.status() == 401) throw new SecurityException(restError.getMessage());

        }

        return defaultEncoder.decode(methodKey, response);
    }

    private Date createRetryAfter(BigDecimal secondsToWait) {

        Date retryDate = new Date(System.currentTimeMillis() + secondsToWait.multiply(new BigDecimal(1000)).intValue());

        return retryDate;
    }
}
