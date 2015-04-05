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

package com.coinkite.api.neww;

import feign.Headers;
import feign.Param;
import feign.RequestLine;

import java.math.BigDecimal;

/**
 * <a href="https://docs.coinkite.com/api/new-update.html">https://docs.coinkite.com/api/new-update.html</a>
 */
public interface NewSendReceiveFunds {

    @RequestLine("PUT /v1/new/receive?account={account}&show_memo={show_memo}&show_public={show_public}&amount={amount}&memo={memo}&show_username={show_username}")
    ReceiveResponse newReceive(@Param(value = "account") String account, @Param(value = "amount")BigDecimal amount);
    @RequestLine("PUT /v1/new/receive")
    @Headers(value = "Content-Type: application/json")
    ReceiveResponse newReceiveJson(ReceiveRequest receiveRequest);
}
