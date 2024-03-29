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

import com.coinkite.api.model.CurrencyAmount;
import com.coinkite.api.my.AccountSummary;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class ReceiveResponseArgsMarshalTest {

    private ObjectMapper om;

    @Before
    public void setup() throws JsonProcessingException {

        om = new ObjectMapper();
    }

    @Test
    public void canUnmarshalFromJson() throws IOException {

        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource("receiveResponse.json").getFile());

        ReceiveResponse rr = om.readValue(file, ReceiveResponse.class);

        AccountSummary account = rr.getArgs().getAccount();
        assertEquals("std", account.getCKAcctType());

        CurrencyAmount amount = rr.getArgs().getAmount();
        assertEquals("XTN", amount.getCurrency());


    }

    @Test
    public void canMarshalToJson() throws JsonProcessingException {

    }
}
