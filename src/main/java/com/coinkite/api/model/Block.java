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

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.annotation.Generated;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
public class Block extends BaseCoinkiteDomain {

    @JsonProperty("coin_type")
    private String coinType;
    @JsonProperty("fully_confirmed")
    private Boolean fullyConfirmed;
    @JsonProperty("hash")
    private String hash;
    @JsonProperty("height")
    private Integer height;

    public String getCoinType() {

        return coinType;
    }

    public void setCoinType(String coinType) {

        this.coinType = coinType;
    }

    public Boolean getFullyConfirmed() {

        return fullyConfirmed;
    }

    public void setFullyConfirmed(Boolean fullyConfirmed) {

        this.fullyConfirmed = fullyConfirmed;
    }

    public String getHash() {

        return hash;
    }

    public void setHash(String hash) {

        this.hash = hash;
    }

    public Integer getHeight() {

        return height;
    }

    public void setHeight(Integer height) {

        this.height = height;
    }


}