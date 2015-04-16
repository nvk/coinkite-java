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

package com.coinkite.api.list.model;

import com.coinkite.api.BaseCoinkiteDomain;
import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
public class Receive extends BaseCoinkiteDomain {

    @JsonProperty("CK_req_type")
    private String CKReqType;
    @JsonProperty("account")
    private String account;
    @JsonProperty("address")
    private String address;
    @JsonProperty("amount")
    private Object amount;
    @JsonProperty("amount_so_far")
    private CurrencyAmount amountSoFar;
    @JsonProperty("archived_at")
    private Object archivedAt;
    @JsonProperty("coin")
    private Coin coin;
    @JsonProperty("coin_type")
    private String coinType;
    @JsonProperty("desc")
    private String desc;
    @JsonProperty("is_completed")
    private Boolean isCompleted;
    @JsonProperty("memo")
    private String memo;
    @JsonProperty("qr_url")
    private String qrUrl;
    @JsonProperty("show_memo")
    private Boolean showMemo;
    @JsonProperty("show_public")
    private Boolean showPublic;
    @JsonProperty("show_username")
    private Boolean showUsername;

    public String getCKReqType() {

        return CKReqType;
    }

    public void setCKReqType(String CKReqType) {

        this.CKReqType = CKReqType;
    }

    public String getAccount() {

        return account;
    }

    public void setAccount(String account) {

        this.account = account;
    }

    public String getAddress() {

        return address;
    }

    public void setAddress(String address) {

        this.address = address;
    }

    public Object getAmount() {

        return amount;
    }

    public void setAmount(Object amount) {

        this.amount = amount;
    }

    public CurrencyAmount getAmountSoFar() {

        return amountSoFar;
    }

    public void setAmountSoFar(CurrencyAmount amountSoFar) {

        this.amountSoFar = amountSoFar;
    }

    public Object getArchivedAt() {

        return archivedAt;
    }

    public void setArchivedAt(Object archivedAt) {

        this.archivedAt = archivedAt;
    }

    public Coin getCoin() {

        return coin;
    }

    public void setCoin(Coin coin) {

        this.coin = coin;
    }

    public String getCoinType() {

        return coinType;
    }

    public void setCoinType(String coinType) {

        this.coinType = coinType;
    }

    public String getDesc() {

        return desc;
    }

    public void setDesc(String desc) {

        this.desc = desc;
    }

    public Boolean getIsCompleted() {

        return isCompleted;
    }

    public void setIsCompleted(Boolean isCompleted) {

        this.isCompleted = isCompleted;
    }

    public String getMemo() {

        return memo;
    }

    public void setMemo(String memo) {

        this.memo = memo;
    }

    public String getQrUrl() {

        return qrUrl;
    }

    public void setQrUrl(String qrUrl) {

        this.qrUrl = qrUrl;
    }

    public Boolean getShowMemo() {

        return showMemo;
    }

    public void setShowMemo(Boolean showMemo) {

        this.showMemo = showMemo;
    }

    public Boolean getShowPublic() {

        return showPublic;
    }

    public void setShowPublic(Boolean showPublic) {

        this.showPublic = showPublic;
    }

    public Boolean getShowUsername() {

        return showUsername;
    }

    public void setShowUsername(Boolean showUsername) {

        this.showUsername = showUsername;
    }

    @Override
    public String toString() {

        return "Receive{" +
                ", CKReqType='" + CKReqType + '\'' +
                ", account='" + account + '\'' +
                ", address='" + address + '\'' +
                ", amount=" + amount +
                ", amountSoFar=" + amountSoFar +
                ", archivedAt=" + archivedAt +
                ", coin=" + coin +
                ", coinType='" + coinType + '\'' +
                ", desc='" + desc + '\'' +
                ", isCompleted=" + isCompleted +
                ", memo='" + memo + '\'' +
                ", qrUrl='" + qrUrl + '\'' +
                ", showMemo=" + showMemo +
                ", showPublic=" + showPublic +
                ", showUsername=" + showUsername +
                '}';
    }
}
