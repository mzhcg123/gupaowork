package org.example.factory.pay;

public class ApplePay implements IPay {

    @Override
    public void doPay() {
        System.out.println("使用苹果支付！");
    }
}
