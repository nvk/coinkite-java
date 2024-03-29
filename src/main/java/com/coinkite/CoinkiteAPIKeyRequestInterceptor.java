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

import java.util.Optional;

import static com.coinkite.Constants.X_CK_KEY;
import static java.util.Optional.ofNullable;

public class CoinkiteAPIKeyRequestInterceptor implements RequestInterceptor {


    @Override
    public void apply(RequestTemplate template) {

        template.header(X_CK_KEY, getApiKey());
    }

    protected String getApiKey() {

        Optional<String> key = ofNullable(System.getenv(X_CK_KEY));

        if(!key.isPresent()) {
            key = ofNullable(System.getProperty(X_CK_KEY));
        }

        return key.orElseThrow(() -> new RuntimeException("Coinkite key was not passed in as a jvm arg or set on env."));
    }

}
