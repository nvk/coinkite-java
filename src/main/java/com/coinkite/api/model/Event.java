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

package com.coinkite.api.model;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.math.BigDecimal;
import java.util.Date;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes({
        @JsonSubTypes.Type(value = CreditEvent.class, name = "Credit"),
        @JsonSubTypes.Type(value = DebitEvent.class, name = "Debit"),
        @JsonSubTypes.Type(value = AccountEvent.class, name = "Created"),
        @JsonSubTypes.Type(value = AccountEvent.class, name = "Closed")})
@Generated("org.jsonschema2pojo")
public class Event extends BaseCoinkiteDomain {

    @JsonProperty("CK_event_type")
    private String CKEventType;
    @JsonProperty("amount")
    private BigDecimal amount;
    @JsonProperty("coin_type")
    private String coinType;
    @JsonProperty("confirmed_at")
    private Date confirmedAt;

    public String getCKEventType() {

        return CKEventType;
    }

    public void setCKEventType(String CKEventType) {

        this.CKEventType = CKEventType;
    }

    public BigDecimal getAmount() {

        return amount;
    }

    public void setAmount(BigDecimal amount) {

        this.amount = amount;
    }

    public String getCoinType() {

        return coinType;
    }

    public void setCoinType(String coinType) {

        this.coinType = coinType;
    }

    public Date getConfirmedAt() {

        return (Date) confirmedAt.clone();
    }

    public void setConfirmedAt(Date confirmedAt) {

        this.confirmedAt = confirmedAt == null ? null : (Date) confirmedAt.clone();
    }

    @Override
    public String toString() {

        return "Event{" +
                "CKEventType='" + CKEventType + '\'' +
                ", amount=" + amount +
                ", coinType='" + coinType + '\'' +
                ", confirmedAt=" + confirmedAt +
                "} " + super.toString();
    }
}
