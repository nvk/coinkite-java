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

package com.coinkite.api.my;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
public class ApiKey {

    @JsonProperty("CK_refnum")
    private String CKRefnum;
    @JsonProperty("CK_type")
    private String CKType;
    @JsonProperty("api_key")
    private String apiKey;
    @JsonProperty("funds_limit")
    private Object fundsLimit;
    @JsonProperty("max_request_rate")
    private Integer maxRequestRate;
    @JsonProperty("memo")
    private String memo;
    @JsonProperty("only_subaccounts")
    private List<String> onlySubaccounts = new ArrayList<String>();
    @JsonProperty("permissions")
    private List<String> permissions = new ArrayList<String>();
    @JsonProperty("source_ip")
    private Object sourceIp;
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
     * @return The apiKey
     */
    @JsonProperty("api_key")
    public String getApiKey() {

        return apiKey;
    }

    /**
     * @param apiKey The api_key
     */
    @JsonProperty("api_key")
    public void setApiKey(String apiKey) {

        this.apiKey = apiKey;
    }

    /**
     * @return The fundsLimit
     */
    @JsonProperty("funds_limit")
    public Object getFundsLimit() {

        return fundsLimit;
    }

    /**
     * @param fundsLimit The funds_limit
     */
    @JsonProperty("funds_limit")
    public void setFundsLimit(Object fundsLimit) {

        this.fundsLimit = fundsLimit;
    }

    /**
     * @return The maxRequestRate
     */
    @JsonProperty("max_request_rate")
    public Integer getMaxRequestRate() {

        return maxRequestRate;
    }

    /**
     * @param maxRequestRate The max_request_rate
     */
    @JsonProperty("max_request_rate")
    public void setMaxRequestRate(Integer maxRequestRate) {

        this.maxRequestRate = maxRequestRate;
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
     * @return The onlySubaccounts
     */
    @JsonProperty("only_subaccounts")
    public List<String> getOnlySubaccounts() {

        return onlySubaccounts;
    }

    /**
     * @param onlySubaccounts The only_subaccounts
     */
    @JsonProperty("only_subaccounts")
    public void setOnlySubaccounts(List<String> onlySubaccounts) {

        this.onlySubaccounts = onlySubaccounts;
    }

    /**
     * @return The permissions
     */
    @JsonProperty("permissions")
    public List<String> getPermissions() {

        return permissions;
    }

    /**
     * @param permissions The permissions
     */
    @JsonProperty("permissions")
    public void setPermissions(List<String> permissions) {

        this.permissions = permissions;
    }

    /**
     * @return The sourceIp
     */
    @JsonProperty("source_ip")
    public Object getSourceIp() {

        return sourceIp;
    }

    /**
     * @param sourceIp The source_ip
     */
    @JsonProperty("source_ip")
    public void setSourceIp(Object sourceIp) {

        this.sourceIp = sourceIp;
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