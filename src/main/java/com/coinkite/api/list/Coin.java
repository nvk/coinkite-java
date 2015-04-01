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
public class Coin {

    @JsonProperty("CK_refnum")
    private String CKRefnum;
    @JsonProperty("CK_type")
    private String CKType;
    @JsonProperty("address")
    private String address;
    @JsonProperty("coin_type")
    private String coinType;
    @JsonProperty("subkey")
    private String subkey;
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
     * @return The subkey
     */
    @JsonProperty("subkey")
    public String getSubkey() {

        return subkey;
    }

    /**
     * @param subkey The subkey
     */
    @JsonProperty("subkey")
    public void setSubkey(String subkey) {

        this.subkey = subkey;
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