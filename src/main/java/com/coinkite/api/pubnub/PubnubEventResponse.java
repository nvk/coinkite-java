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

package com.coinkite.api.pubnub;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(value = JsonInclude.Include.NON_NULL)
public class PubnubEventResponse {

    @JsonProperty("event_code")
    private EventCode eventCode;
    private String desc;
    private String activity;
    @JsonProperty("ip_address")
    private String ipAddress;
    @JsonProperty("detail_url")
    private String detailUrl;
    private EventRefnums refnums;

    public EventCode getEventCode() {

        return eventCode;
    }

    public void setEventCode(EventCode eventCode) {

        this.eventCode = eventCode;
    }

    public String getDesc() {

        return desc;
    }

    public void setDesc(String desc) {

        this.desc = desc;
    }

    public String getActivity() {

        return activity;
    }

    public void setActivity(String activity) {

        this.activity = activity;
    }

    public String getIpAddress() {

        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {

        this.ipAddress = ipAddress;
    }

    public String getDetailUrl() {

        return detailUrl;
    }

    public void setDetailUrl(String detailUrl) {

        this.detailUrl = detailUrl;
    }

    public EventRefnums getRefnums() {

        return refnums;
    }

    public void setRefnums(EventRefnums refnums) {

        this.refnums = refnums;
    }

    @Override
    public String toString() {

        return "PubnubEventResponse{" +
                "eventCode=" + eventCode +
                ", desc='" + desc + '\'' +
                ", activity='" + activity + '\'' +
                ", ipAddress='" + ipAddress + '\'' +
                ", detailUrl='" + detailUrl + '\'' +
                ", refnums=" + refnums +
                '}';
    }
}
