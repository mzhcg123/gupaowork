package org.example.factory.pay;

public class Test {

    public static void main(String[] args) {

        //跨境支付
        IPayFactory crossPayFactory = new CrossPayFactory();
        IPay pay = crossPayFactory.createPay(ApplePay.class);
        pay.doPay();


        //国内支付
        IPayFactory territoryPayFactory = new TerritoryPayFactory();
        IPay pay1 = territoryPayFactory.createPay(AliPay.class);
//        territoryPayFactory.createPay(WechatPay.class);
//        territoryPayFactory.createPay(UnionPay.class);
        pay1.doPay();

    }
}
