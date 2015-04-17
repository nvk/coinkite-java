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
import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
public class CurrencyAmount {

    @JsonProperty("currency")
    private String currency;
    @JsonProperty("decimal")
    private BigDecimal decimal;
    @JsonProperty("integer")
    private BigInteger integer;
    @JsonProperty("integer_scale")
    private Integer integerScale;
    @JsonProperty("pretty")
    private String pretty;
    @JsonProperty("string")
    private String string;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public String getCurrency() {

        return currency;
    }

    public void setCurrency(String currency) {

        this.currency = currency;
    }

    public BigDecimal getDecimal() {

        return decimal;
    }

    public void setDecimal(BigDecimal decimal) {

        this.decimal = decimal;
    }

    public BigInteger getInteger() {

        return integer;
    }

    public void setInteger(BigInteger integer) {

        this.integer = integer;
    }

    public Integer getIntegerScale() {

        return integerScale;
    }

    public void setIntegerScale(Integer integerScale) {

        this.integerScale = integerScale;
    }

    public String getPretty() {

        return pretty;
    }

    public void setPretty(String pretty) {

        this.pretty = pretty;
    }

    public String getString() {

        return string;
    }

    public void setString(String string) {

        this.string = string;
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
