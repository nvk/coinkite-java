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
public class SelfDetails {

    @JsonProperty("api_key")
    private ApiKey apiKey;
    @JsonProperty("member_since")
    private String memberSince;
    @JsonProperty("membership")
    private String membership;
    @JsonProperty("nyms")
    private List<String> nyms = new ArrayList<String>();
    @JsonProperty("supported_cct")
    private Map<String, String> supportedCct;
    @JsonProperty("username")
    private String username;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * @return The apiKey
     */
    @JsonProperty("api_key")
    public ApiKey getApiKey() {

        return apiKey;
    }

    /**
     * @param apiKey The api_key
     */
    @JsonProperty("api_key")
    public void setApiKey(ApiKey apiKey) {

        this.apiKey = apiKey;
    }

    /**
     * @return The memberSince
     */
    @JsonProperty("member_since")
    public String getMemberSince() {

        return memberSince;
    }

    /**
     * @param memberSince The member_since
     */
    @JsonProperty("member_since")
    public void setMemberSince(String memberSince) {

        this.memberSince = memberSince;
    }

    /**
     * @return The membership
     */
    @JsonProperty("membership")
    public String getMembership() {

        return membership;
    }

    /**
     * @param membership The membership
     */
    @JsonProperty("membership")
    public void setMembership(String membership) {

        this.membership = membership;
    }

    /**
     * @return The nyms
     */
    @JsonProperty("nyms")
    public List<String> getNyms() {

        return nyms;
    }

    /**
     * @param nyms The nyms
     */
    @JsonProperty("nyms")
    public void setNyms(List<String> nyms) {

        this.nyms = nyms;
    }

    /**
     * @return The supportedCct
     */
    @JsonProperty("supported_cct")
    public Map<String, String> getSupportedCct() {

        return supportedCct;
    }

    /**
     * @param supportedCct The supported_cct
     */
    @JsonProperty("supported_cct")
    public void setSupportedCct(Map<String, String> supportedCct) {

        this.supportedCct = supportedCct;
    }

    /**
     * @return The username
     */
    @JsonProperty("username")
    public String getUsername() {

        return username;
    }

    /**
     * @param username The username
     */
    @JsonProperty("username")
    public void setUsername(String username) {

        this.username = username;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {

        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {

        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {

        return "SelfDetails{" +
                "apiKey=" + apiKey +
                ", memberSince='" + memberSince + '\'' +
                ", membership='" + membership + '\'' +
                ", nyms=" + nyms +
                ", supportedCct=" + supportedCct +
                ", username='" + username + '\'' +
                ", additionalProperties=" + additionalProperties +
                '}';
    }
}