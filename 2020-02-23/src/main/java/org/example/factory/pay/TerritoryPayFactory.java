package org.example.factory.pay;

public class TerritoryPayFactory implements IPayFactory {

    @Override
    public IPay createPay(Class<?> clazz) {
        try {
            System.out.println("创建境内支付！");
            return (IPay) clazz.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
