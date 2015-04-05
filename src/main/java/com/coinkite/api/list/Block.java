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

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
public class Block extends BaseCoinkiteDomain {

    @JsonProperty("CK_type")
    private String CKType;
    @JsonProperty("coin_type")
    private String coinType;
    @JsonProperty("fully_confirmed")
    private Boolean fullyConfirmed;
    @JsonProperty("hash")
    private String hash;
    @JsonProperty("height")
    private Integer height;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

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
     * The fullyConfirmed
     */
    @JsonProperty("fully_confirmed")
    public Boolean getFullyConfirmed() {
        return fullyConfirmed;
    }

    /**
     *
     * @param fullyConfirmed
     * The fully_confirmed
     */
    @JsonProperty("fully_confirmed")
    public void setFullyConfirmed(Boolean fullyConfirmed) {
        this.fullyConfirmed = fullyConfirmed;
    }

    /**
     *
     * @return
     * The hash
     */
    @JsonProperty("hash")
    public String getHash() {
        return hash;
    }

    /**
     *
     * @param hash
     * The hash
     */
    @JsonProperty("hash")
    public void setHash(String hash) {
        this.hash = hash;
    }

    /**
     *
     * @return
     * The height
     */
    @JsonProperty("height")
    public Integer getHeight() {
        return height;
    }

    /**
     *
     * @param height
     * The height
     */
    @JsonProperty("height")
    public void setHeight(Integer height) {
        this.height = height;
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