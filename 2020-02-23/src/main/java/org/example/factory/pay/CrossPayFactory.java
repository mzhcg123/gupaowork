package org.example.factory.pay;

public class CrossPayFactory implements IPayFactory {

    @Override
    public IPay createPay(Class<?> clazz) {
        try {
            System.out.println("创建跨境支付！");
            return (IPay) clazz.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }


}
