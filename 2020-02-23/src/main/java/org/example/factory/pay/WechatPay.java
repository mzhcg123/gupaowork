package org.example.factory.pay;

public class WechatPay implements IPay {

    @Override
    public void doPay() {
        System.out.println("使用微信支付！");
    }
}
