package org.example.factory.pay;

public class AliPay implements IPay {

    @Override
    public void doPay() {
        System.out.println("使用支付宝支付！");
    }
}
