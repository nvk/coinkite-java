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
public class AmountSoFar {

    @JsonProperty("currency")
    private String currency;
    @JsonProperty("decimal")
    private Integer decimal;
    @JsonProperty("integer")
    private Integer integer;
    @JsonProperty("integer_scale")
    private Integer integerScale;
    @JsonProperty("pretty")
    private String pretty;
    @JsonProperty("string")
    private String string;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     *
     * @return
     * The currency
     */
    @JsonProperty("currency")
    public String getCurrency() {
        return currency;
    }

    /**
     *
     * @param currency
     * The currency
     */
    @JsonProperty("currency")
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    /**
     *
     * @return
     * The decimal
     */
    @JsonProperty("decimal")
    public Integer getDecimal() {
        return decimal;
    }

    /**
     *
     * @param decimal
     * The decimal
     */
    @JsonProperty("decimal")
    public void setDecimal(Integer decimal) {
        this.decimal = decimal;
    }

    /**
     *
     * @return
     * The integer
     */
    @JsonProperty("integer")
    public Integer getInteger() {
        return integer;
    }

    /**
     *
     * @param integer
     * The integer
     */
    @JsonProperty("integer")
    public void setInteger(Integer integer) {
        this.integer = integer;
    }

    /**
     *
     * @return
     * The integerScale
     */
    @JsonProperty("integer_scale")
    public Integer getIntegerScale() {
        return integerScale;
    }

    /**
     *
     * @param integerScale
     * The integer_scale
     */
    @JsonProperty("integer_scale")
    public void setIntegerScale(Integer integerScale) {
        this.integerScale = integerScale;
    }

    /**
     *
     * @return
     * The pretty
     */
    @JsonProperty("pretty")
    public String getPretty() {
        return pretty;
    }

    /**
     *
     * @param pretty
     * The pretty
     */
    @JsonProperty("pretty")
    public void setPretty(String pretty) {
        this.pretty = pretty;
    }

    /**
     *
     * @return
     * The string
     */
    @JsonProperty("string")
    public String getString() {
        return string;
    }

    /**
     *
     * @param string
     * The string
     */
    @JsonProperty("string")
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
