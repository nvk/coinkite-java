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
public class AccountSummary {

    @JsonProperty("CK_acct_type")
    private String CKAcctType;
    @JsonProperty("CK_refnum")
    private String CKRefnum;
    @JsonProperty("CK_type")
    private String CKType;
    @JsonProperty("coin_type")
    private String coinType;
    @JsonProperty("is_closed")
    private Boolean isClosed;
    @JsonProperty("m_of_n")
    private List<Integer> mOfN = new ArrayList<Integer>();
    @JsonProperty("name")
    private String name;
    @JsonProperty("num_keys")
    private Integer numKeys;
    @JsonProperty("num_required")
    private Integer numRequired;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     *
     * @return
     * The CKAcctType
     */
    @JsonProperty("CK_acct_type")
    public String getCKAcctType() {
        return CKAcctType;
    }

    /**
     *
     * @param CKAcctType
     * The CK_acct_type
     */
    @JsonProperty("CK_acct_type")
    public void setCKAcctType(String CKAcctType) {
        this.CKAcctType = CKAcctType;
    }

    /**
     *
     * @return
     * The CKRefnum
     */
    @JsonProperty("CK_refnum")
    public String getCKRefnum() {
        return CKRefnum;
    }

    /**
     *
     * @param CKRefnum
     * The CK_refnum
     */
    @JsonProperty("CK_refnum")
    public void setCKRefnum(String CKRefnum) {
        this.CKRefnum = CKRefnum;
    }

    /**
     *
     * @return
     * The CKType
     */
    @JsonProperty("CK_type")
    public String getCKType() {
        return CKType;
    }

    /**
     *
     * @param CKType
     * The CK_type
     */
    @JsonProperty("CK_type")
    public void setCKType(String CKType) {
        this.CKType = CKType;
    }

    /**
     *
     * @return
     * The coinType
     */
    @JsonProperty("coin_type")
    public String getCoinType() {
        return coinType;
    }

    /**
     *
     * @param coinType
     * The coin_type
     */
    @JsonProperty("coin_type")
    public void setCoinType(String coinType) {
        this.coinType = coinType;
    }

    /**
     *
     * @return
     * The isClosed
     */
    @JsonProperty("is_closed")
    public Boolean getIsClosed() {
        return isClosed;
    }

    /**
     *
     * @param isClosed
     * The is_closed
     */
    @JsonProperty("is_closed")
    public void setIsClosed(Boolean isClosed) {
        this.isClosed = isClosed;
    }

    /**
     *
     * @return
     * The mOfN
     */
    @JsonProperty("m_of_n")
    public List<Integer> getMOfN() {
        return mOfN;
    }

    /**
     *
     * @param mOfN
     * The m_of_n
     */
    @JsonProperty("m_of_n")
    public void setMOfN(List<Integer> mOfN) {
        this.mOfN = mOfN;
    }

    /**
     *
     * @return
     * The name
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     *
     * @param name
     * The name
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return
     * The numKeys
     */
    @JsonProperty("num_keys")
    public Integer getNumKeys() {
        return numKeys;
    }

    /**
     *
     * @param numKeys
     * The num_keys
     */
    @JsonProperty("num_keys")
    public void setNumKeys(Integer numKeys) {
        this.numKeys = numKeys;
    }

    /**
     *
     * @return
     * The numRequired
     */
    @JsonProperty("num_required")
    public Integer getNumRequired() {
        return numRequired;
    }

    /**
     *
     * @param numRequired
     * The num_required
     */
    @JsonProperty("num_required")
    public void setNumRequired(Integer numRequired) {
        this.numRequired = numRequired;
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
