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


public enum EventCode {

    credit_0("Credit received (ZERO confirmations-may still be reversed)"),
    credit_1("Credit received (first confirmation)"),
    credit_full("Credit received and fully confirmed"),
    good_login("Successful login"),
    bad_login("Failed login attempt"),
    user_logout("User has logged out"),
    send_setup("Send funds was setup"),
    send_auth("Send funds authorized"),
    recv_setup("New receive request created"),
    xfer("Internal funds transfer started"),
    card_used("Card was used at a payment terminal"),
    new_card("New card was linked to your account"),
    qr_login("Account accessed at payment terminal (QR login)"),
    bill_paid("An invoice was paid"),
    voucher_claimed("Voucher was redeemed (claimed)"),
    email_change("Email address changed/updated"),
    funds_forward("Recent deposit has been forwarded"),
    forward_change("Funds forwarding added/changed"),
    phone_change("Phone number added/changed"),
    critical_notice("Critical notice"),
    apikey_change("API Key added/changed"),
    txn_signed("Transaction signed and transmitted (available via API only)"),
    receipt_printed("A receipt was printed at terminal (available via API only)"),
    sms_sent("SMS message was delivered successfully (API only)"),
    sms_failed("SMS message failed to be sent (API only)"),
    xdebit("External debit observed on watched address (applicable only to watch-only accounts)"),
    sweep_now("New funds available for private key sweep (internal, ignore)"),
    cosign_start("Proposed transaction is ready for co-signing"),
    cosign_more("Proposed transaction has been approved by (another) co-signer");

    private String description;

    EventCode(String description) {

        this.description = description;
    }

    public String getDescription() {

        return description;
    }
}
