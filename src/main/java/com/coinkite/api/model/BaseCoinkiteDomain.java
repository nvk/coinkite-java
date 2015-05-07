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

import java.util.HashMap;
import java.util.Map;

//@JsonTypeInfo(use= JsonTypeInfo.Id.NAME, include=JsonTypeInfo.As.PROPERTY, property="CK_type")
//@JsonSubTypes({
//        @JsonSubTypes.Type(value = Activity.class, name = "CKActivityLog"),
//        @JsonSubTypes.Type(value = Receive.class, name = "CKReqReceive"),
//        @JsonSubTypes.Type(value = Event.class, name = "CKEvent")})
public abstract class BaseCoinkiteDomain {

    @JsonProperty("CK_refnum")
    private String CKRefnum;
    @JsonProperty("CK_type")
    private String CKType;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<>();

    public String getCKRefnum() {

        return CKRefnum;
    }

    public void setCKRefnum(String CKRefnum) {

        this.CKRefnum = CKRefnum;
    }

    public String getCKType() {

        return CKType;
    }

    public void setCKType(String CKType) {

        this.CKType = CKType;
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
