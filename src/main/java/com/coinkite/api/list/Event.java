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

package com.coinkite.api.list;

import com.coinkite.api.BaseCoinkiteDomain;
import com.fasterxml.jackson.annotation.*;

import java.util.Date;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", visible = true)
@JsonSubTypes({
        @JsonSubTypes.Type(value = CreditEvent.class, name = "Credit")})
public class Event extends BaseCoinkiteDomain {

    @JsonProperty("CK_event_type")
    private String CKEventType;
    @JsonProperty("amount")
    private Integer amount;
    @JsonProperty("coin_type")
    private String coinType;
    @JsonProperty("confirmed_at")
    private Date confirmedAt;
    @JsonProperty("type")
    private String type;

    public String getCKEventType() {

        return CKEventType;
    }

    public void setCKEventType(String CKEventType) {

        this.CKEventType = CKEventType;
    }

    public Integer getAmount() {

        return amount;
    }

    public void setAmount(Integer amount) {

        this.amount = amount;
    }

    public String getCoinType() {

        return coinType;
    }

    public void setCoinType(String coinType) {

        this.coinType = coinType;
    }

    public Date getConfirmedAt() {

        return confirmedAt;
    }

    public void setConfirmedAt(Date confirmedAt) {

        this.confirmedAt = confirmedAt;
    }

    public String getType() {

        return type;
    }

    public void setType(String type) {

        this.type = type;
    }
}
