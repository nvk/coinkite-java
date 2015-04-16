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

package com.coinkite.api.pubnub;

import com.coinkite.config.ObjectMapperFactory;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsonorg.JsonOrgModule;
import com.pubnub.api.Callback;
import com.pubnub.api.PubnubError;

public class CoinkitePubnubCallback extends Callback {

    private CoinkiteEventCallback delegate;
    private final ObjectMapper mapper;

    public CoinkitePubnubCallback(CoinkiteEventCallback coinkiteEventCallback) {

        super();

        this.delegate = coinkiteEventCallback;

        mapper = ObjectMapperFactory.createObjectMapper();
    }

    @Override
    public void successCallback(String channel, Object message) {

        delegate.successCallback(mapper.convertValue(message, PubnubEventResponse.class) );
    }

    @Override
    public void successCallback(String channel, Object message, String timetoken) {

        delegate.successCallback(mapper.convertValue(message, PubnubEventResponse.class), timetoken);
    }

    @Override
    public void errorCallback(String channel, PubnubError error) {

        delegate.errorCallback(error);
    }

    @Override
    public void connectCallback(String channel, Object message) {

        delegate.connectCallback(message);
    }

    @Override
    public void reconnectCallback(String channel, Object message) {

        delegate.reconnectCallback(message);
    }

    @Override
    public void disconnectCallback(String channel, Object message) {

        delegate.disconnectCallback(message);
    }
}
