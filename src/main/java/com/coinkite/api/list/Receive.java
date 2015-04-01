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

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
public class Receive  {

    @JsonProperty("CK_refnum")
    private String CKRefnum;
    @JsonProperty("CK_req_type")
    private String CKReqType;
    @JsonProperty("CK_type")
    private String CKType;
    @JsonProperty("account")
    private String account;
    @JsonProperty("address")
    private String address;
    @JsonProperty("amount")
    private Object amount;
    @JsonProperty("amount_so_far")
    private AmountSoFar amountSoFar;
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
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * @return The CKRefnum
     */
    @JsonProperty("CK_refnum")
    public String getCKRefnum() {

        return CKRefnum;
    }

    /**
     * @param CKRefnum The CK_refnum
     */
    @JsonProperty("CK_refnum")
    public void setCKRefnum(String CKRefnum) {

        this.CKRefnum = CKRefnum;
    }

    /**
     * @return The CKReqType
     */
    @JsonProperty("CK_req_type")
    public String getCKReqType() {

        return CKReqType;
    }

    /**
     * @param CKReqType The CK_req_type
     */
    @JsonProperty("CK_req_type")
    public void setCKReqType(String CKReqType) {

        this.CKReqType = CKReqType;
    }

    /**
     * @return The CKType
     */
    @JsonProperty("CK_type")
    public String getCKType() {

        return CKType;
    }

    /**
     * @param CKType The CK_type
     */
    @JsonProperty("CK_type")
    public void setCKType(String CKType) {

        this.CKType = CKType;
    }

    /**
     * @return The account
     */
    @JsonProperty("account")
    public String getAccount() {

        return account;
    }

    /**
     * @param account The account
     */
    @JsonProperty("account")
    public void setAccount(String account) {

        this.account = account;
    }

    /**
     * @return The address
     */
    @JsonProperty("address")
    public String getAddress() {

        return address;
    }

    /**
     * @param address The address
     */
    @JsonProperty("address")
    public void setAddress(String address) {

        this.address = address;
    }

    /**
     * @return The amount
     */
    @JsonProperty("amount")
    public Object getAmount() {

        return amount;
    }

    /**
     * @param amount The amount
     */
    @JsonProperty("amount")
    public void setAmount(Object amount) {

        this.amount = amount;
    }

    /**
     * @return The amountSoFar
     */
    @JsonProperty("amount_so_far")
    public AmountSoFar getAmountSoFar() {

        return amountSoFar;
    }

    /**
     * @param amountSoFar The amount_so_far
     */
    @JsonProperty("amount_so_far")
    public void setAmountSoFar(AmountSoFar amountSoFar) {

        this.amountSoFar = amountSoFar;
    }

    /**
     * @return The archivedAt
     */
    @JsonProperty("archived_at")
    public Object getArchivedAt() {

        return archivedAt;
    }

    /**
     * @param archivedAt The archived_at
     */
    @JsonProperty("archived_at")
    public void setArchivedAt(Object archivedAt) {

        this.archivedAt = archivedAt;
    }

    /**
     * @return The coin
     */
    @JsonProperty("coin")
    public Coin getCoin() {

        return coin;
    }

    /**
     * @param coin The coin
     */
    @JsonProperty("coin")
    public void setCoin(Coin coin) {

        this.coin = coin;
    }

    /**
     * @return The coinType
     */
    @JsonProperty("coin_type")
    public String getCoinType() {

        return coinType;
    }

    /**
     * @param coinType The coin_type
     */
    @JsonProperty("coin_type")
    public void setCoinType(String coinType) {

        this.coinType = coinType;
    }

    /**
     * @return The desc
     */
    @JsonProperty("desc")
    public String getDesc() {

        return desc;
    }

    /**
     * @param desc The desc
     */
    @JsonProperty("desc")
    public void setDesc(String desc) {

        this.desc = desc;
    }

    /**
     * @return The isCompleted
     */
    @JsonProperty("is_completed")
    public Boolean getIsCompleted() {

        return isCompleted;
    }

    /**
     * @param isCompleted The is_completed
     */
    @JsonProperty("is_completed")
    public void setIsCompleted(Boolean isCompleted) {

        this.isCompleted = isCompleted;
    }

    /**
     * @return The memo
     */
    @JsonProperty("memo")
    public String getMemo() {

        return memo;
    }

    /**
     * @param memo The memo
     */
    @JsonProperty("memo")
    public void setMemo(String memo) {

        this.memo = memo;
    }

    /**
     * @return The qrUrl
     */
    @JsonProperty("qr_url")
    public String getQrUrl() {

        return qrUrl;
    }

    /**
     * @param qrUrl The qr_url
     */
    @JsonProperty("qr_url")
    public void setQrUrl(String qrUrl) {

        this.qrUrl = qrUrl;
    }

    /**
     * @return The showMemo
     */
    @JsonProperty("show_memo")
    public Boolean getShowMemo() {

        return showMemo;
    }

    /**
     * @param showMemo The show_memo
     */
    @JsonProperty("show_memo")
    public void setShowMemo(Boolean showMemo) {

        this.showMemo = showMemo;
    }

    /**
     * @return The showPublic
     */
    @JsonProperty("show_public")
    public Boolean getShowPublic() {

        return showPublic;
    }

    /**
     * @param showPublic The show_public
     */
    @JsonProperty("show_public")
    public void setShowPublic(Boolean showPublic) {

        this.showPublic = showPublic;
    }

    /**
     * @return The showUsername
     */
    @JsonProperty("show_username")
    public Boolean getShowUsername() {

        return showUsername;
    }

    /**
     * @param showUsername The show_username
     */
    @JsonProperty("show_username")
    public void setShowUsername(Boolean showUsername) {

        this.showUsername = showUsername;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {

        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {

        this.additionalProperties.put(name, value);
    }

}
