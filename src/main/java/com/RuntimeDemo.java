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

package com;

import com.coinkite.api.RestError;
import com.coinkite.api.detail.dto.ObjectDetailsResponse;
import com.coinkite.api.list.ListRecords;
import com.coinkite.api.model.CreditEvent;
import com.coinkite.api.my.UserLevelRecords;
import com.coinkite.api.neww.NewSendReceiveFunds;
import com.coinkite.api.neww.ReceiveRequest;
import com.coinkite.api.neww.ReceiveResponse;
import com.coinkite.CoinkiteAPIKeyRequestInterceptor;
import com.coinkite.CoinkiteSigningRequestInterceptor;
import com.coinkite.CoinkiteErrorResponseDecoder;
import com.coinkite.api.pubnub.*;
import com.coinkite.config.ApiCallerFactory;
import com.coinkite.config.ObjectMapperFactory;
import com.coinkite.service.CoinkiteDetailsService;
import com.pubnub.api.Pubnub;
import feign.Feign;
import feign.jackson.JacksonDecoder;
import feign.jackson.JacksonEncoder;
import feign.okhttp.OkHttpClient;
import feign.slf4j.Slf4jLogger;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigDecimal;

public class RuntimeDemo {

    private static final Logger logger = LoggerFactory.getLogger(RuntimeDemo.class);

    public static void main(String[] args) {

        RuntimeDemo demo = new RuntimeDemo();

        PubnubEventResponse responseToSend = new PubnubEventResponse();
        EventRefnums eventRefnums = new EventRefnums();
        eventRefnums.setRequest("B9794432ED-36E534");
        responseToSend.setRefnums(eventRefnums);
        responseToSend.setActivity("FF7449705A-B0BBF3");
        responseToSend.setIpAddress("127.0.0.1");
        responseToSend.setEventCode(EventCode.credit_1);
        responseToSend.setDesc("");
        responseToSend.setDetailUrl("https://coinkite.com/detail-view/B9794432ED-36E534");

        RealTimeEvents realTimeEvents = buildFeignClient(RealTimeEvents.class);
        EventEnableResponse response = realTimeEvents.enable();
        EventSendResponse send = realTimeEvents.send(responseToSend);

        System.out.println(response);
        System.out.println(send);
//        demo.executeMyAccount();

//        demo.executeNewReceive();

//        for(int i = 0; i < 4; i++) {
//            demo.executeListRecords();
//        }

        ObjectDetailsResponse objectDetailsResponse = CoinkiteDetailsService.INSTANCE.lookupDetails("B9794432ED-36E534");

//        System.out.println(objectDetailsResponse);
    }

    private void executeMyAccount() {

        UserLevelRecords records = buildFeignClient(UserLevelRecords.class);

        System.out.println(records.self());
    }

    private void executeNewReceive() {

        NewSendReceiveFunds sendReceiveFunds = buildFeignClient(NewSendReceiveFunds.class);

        ReceiveRequest rr = new ReceiveRequest();
        rr.setAccount("07160291A3-CCF2E5");
        rr.setShowMemo(true);
        rr.setAmount(new BigDecimal(33));
        rr.setMemo("memo from Demo");
        rr.setShowUsername(false);

        ReceiveResponse receiveResponse = sendReceiveFunds.newReceiveJson(rr);

        System.out.println(receiveResponse);
    }

    private void executeListRecords() {

        ListRecords listRecords = buildFeignClient(ListRecords.class);

        System.out.println(listRecords.credits());
        System.out.println(listRecords.receives());

    }

    private static <T> T buildFeignClient(Class<T> clazz) {

        return ApiCallerFactory.create(clazz);
    }
}
