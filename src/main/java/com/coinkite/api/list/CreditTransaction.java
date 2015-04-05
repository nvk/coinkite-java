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
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.annotation.Generated;
import java.math.BigDecimal;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
public class CreditTransaction extends BaseCoinkiteDomain {

    @JsonProperty("amount")
    private BigDecimal amount;
    @JsonProperty("block")
    private Block block;
    @JsonProperty("coin")
    private Coin coin;
    @JsonProperty("confirmations")
    private Integer confirmations;
    @JsonProperty("is_coinbase")
    private Boolean isCoinbase;
    @JsonProperty("is_failed")
    private Boolean isFailed;
    @JsonProperty("is_immature_coin")
    private Boolean isImmatureCoin;
    @JsonProperty("is_spent")
    private Boolean isSpent;
    @JsonProperty("txo")
    private String txo;

    public BigDecimal getAmount() {

        return amount;
    }

    public void setAmount(BigDecimal amount) {

        this.amount = amount;
    }

    public Block getBlock() {

        return block;
    }

    public void setBlock(Block block) {

        this.block = block;
    }

    public Coin getCoin() {

        return coin;
    }

    public void setCoin(Coin coin) {

        this.coin = coin;
    }

    public Integer getConfirmations() {

        return confirmations;
    }

    public void setConfirmations(Integer confirmations) {

        this.confirmations = confirmations;
    }

    public Boolean getIsCoinbase() {

        return isCoinbase;
    }

    public void setIsCoinbase(Boolean isCoinbase) {

        this.isCoinbase = isCoinbase;
    }

    public Boolean getIsFailed() {

        return isFailed;
    }

    public void setIsFailed(Boolean isFailed) {

        this.isFailed = isFailed;
    }

    public Boolean getIsImmatureCoin() {

        return isImmatureCoin;
    }

    public void setIsImmatureCoin(Boolean isImmatureCoin) {

        this.isImmatureCoin = isImmatureCoin;
    }

    public Boolean getIsSpent() {

        return isSpent;
    }

    public void setIsSpent(Boolean isSpent) {

        this.isSpent = isSpent;
    }

    public String getTxo() {

        return txo;
    }

    public void setTxo(String txo) {

        this.txo = txo;
    }
}
