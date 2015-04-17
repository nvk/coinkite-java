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
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(value = JsonInclude.Include.NON_NULL)
public class ReceiveResponseArgs {

    private AccountSummary account;
    private String memo;
    private CurrencyAmount amount;
    @JsonProperty("show_public")
    private Boolean showPublic;
    @JsonProperty("show_memo")
    private Boolean showMemo;
    @JsonProperty("show_username")
    private Boolean showUsername;

    public AccountSummary getAccount() {

        return account;
    }

    public void setAccount(AccountSummary account) {

        this.account = account;
    }

    public String getMemo() {

        return memo;
    }

    public void setMemo(String memo) {

        this.memo = memo;
    }

    public CurrencyAmount getAmount() {

        return amount;
    }

    public void setAmount(CurrencyAmount amount) {

        this.amount = amount;
    }

    public Boolean isShowPublic() {

        return showPublic;
    }

    public void setShowPublic(Boolean showPublic) {

        this.showPublic = showPublic;
    }

    public Boolean isShowMemo() {

        return showMemo;
    }

    public void setShowMemo(Boolean showMemo) {

        this.showMemo = showMemo;
    }

    public Boolean isShowUsername() {

        return showUsername;
    }

    public void setShowUsername(Boolean showUsername) {

        this.showUsername = showUsername;
    }

    @Override
    public String toString() {

        return "ReceiveResponseArgs{" +
                "account=" + account +
                ", memo='" + memo + '\'' +
                ", amount=" + amount +
                ", showPublic=" + showPublic +
                ", showMemo=" + showMemo +
                ", showUsername=" + showUsername +
                '}';
    }
}
