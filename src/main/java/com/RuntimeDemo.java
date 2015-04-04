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

import com.coinkite.api.list.ListRecords;
import com.coinkite.api.my.UserLevelRecords;
import com.coinkite.api.neww.NewSendReceiveFunds;
import com.coinkite.api.neww.ReceiveRequest;
import com.coinkite.api.neww.ReceiveResponse;
import com.coinkite.CoinkiteAPIKeyRequestInterceptor;
import com.coinkite.CoinkiteSigningRequestInterceptor;
import com.coinkite.CoinkiteErrorResponseDecoder;
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

        demo.executeMyAccount();

//        demo.executeNewReceive();

        for(int i = 0; i < 4; i++) {
            demo.executeListRecords();
        }

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
        rr.setAmount(new BigDecimal(500000));
        rr.setMemo("memo from Demo");
        rr.setShowUsername(false);

        ReceiveResponse receiveResponse = sendReceiveFunds.newReceiveJson(rr);

        System.out.println(receiveResponse);
    }

    private void executeListRecords() {

        ListRecords listRecords = buildFeignClient(ListRecords.class);

        System.out.println(listRecords.receives());
    }

    private <T> T buildFeignClient(Class<T> clazz) {

//        try {
//            Thread.sleep(TimeUnit.SECONDS.toMillis(2));
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        return Feign.builder()
                .client(new OkHttpClient())
                .decoder(new JacksonDecoder())
                .encoder(new JacksonEncoder())
                .errorDecoder(new CoinkiteErrorResponseDecoder())
                .requestInterceptor(new CoinkiteAPIKeyRequestInterceptor())
                .requestInterceptor(new CoinkiteSigningRequestInterceptor())
                .logger(new Slf4jLogger())
                .logLevel(feign.Logger.Level.FULL)
                .target(clazz, "https://api.coinkite.com");
    }
}
