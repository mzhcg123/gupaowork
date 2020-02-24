package org.example.factory.pay;

public class UnionPay implements IPay {

    @Override
    public void doPay() {
        System.out.println("使用银联支付！");
    }
}
