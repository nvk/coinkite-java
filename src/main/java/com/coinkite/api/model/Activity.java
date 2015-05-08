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
import com.fasterxml.jackson.databind.deser.Deserializers;

import javax.annotation.Generated;
import java.util.Date;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
public class Activity extends BaseCoinkiteDomain {

    @JsonProperty("summary")
    private String summary;
    @JsonProperty("created_at")
    private Date createdAt;
    @JsonProperty("ip_address")
    private String ipAddress;

    @JsonProperty("event")
    private Event event;

    @JsonProperty("api_key")
    private String apiKey;
    @JsonProperty("request")
    private BaseCoinkiteDomain request;

    public String getApiKey() {

        return apiKey;
    }

    public void setApiKey(String apiKey) {

        this.apiKey = apiKey;
    }

    public Date getCreatedAt() {

        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {

        this.createdAt = createdAt;
    }

    public String getIpAddress() {

        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {

        this.ipAddress = ipAddress;
    }

    public BaseCoinkiteDomain getRequest() {

        return request;
    }

    public void setRequest(BaseCoinkiteDomain request) {

        this.request = request;
    }

    public String getSummary() {

        return summary;
    }

    public void setSummary(String summary) {

        this.summary = summary;
    }

    public Event getEvent() {

        return event;
    }

    public void setEvent(Event event) {

        this.event = event;
    }

    @Override
    public String toString() {

        return "Activity{" +
                "summary='" + summary + '\'' +
                ", createdAt=" + createdAt +
                ", ipAddress='" + ipAddress + '\'' +
                ", event=" + event +
                ", apiKey='" + apiKey + '\'' +
                ", request=" + request +
                "} " + super.toString();
    }
}
