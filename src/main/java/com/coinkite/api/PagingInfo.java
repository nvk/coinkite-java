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

package com.coinkite.api;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
public class PagingInfo {

    @JsonProperty("count_here")
    private Integer countHere;
    @JsonProperty("limit")
    private Integer limit;
    @JsonProperty("offset")
    private Integer offset;
    @JsonProperty("total_count")
    private Integer totalCount;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * @return The countHere
     */
    @JsonProperty("count_here")
    public Integer getCountHere() {

        return countHere;
    }

    /**
     * @param countHere The count_here
     */
    @JsonProperty("count_here")
    public void setCountHere(Integer countHere) {

        this.countHere = countHere;
    }

    /**
     * @return The limit
     */
    @JsonProperty("limit")
    public Integer getLimit() {

        return limit;
    }

    /**
     * @param limit The limit
     */
    @JsonProperty("limit")
    public void setLimit(Integer limit) {

        this.limit = limit;
    }

    /**
     * @return The offset
     */
    @JsonProperty("offset")
    public Integer getOffset() {

        return offset;
    }

    /**
     * @param offset The offset
     */
    @JsonProperty("offset")
    public void setOffset(Integer offset) {

        this.offset = offset;
    }

    /**
     * @return The totalCount
     */
    @JsonProperty("total_count")
    public Integer getTotalCount() {

        return totalCount;
    }

    /**
     * @param totalCount The total_count
     */
    @JsonProperty("total_count")
    public void setTotalCount(Integer totalCount) {

        this.totalCount = totalCount;
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
