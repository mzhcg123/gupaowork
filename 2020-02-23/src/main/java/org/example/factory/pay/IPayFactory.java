package org.example.factory.pay;

public interface IPayFactory {

    IPay createPay(Class<?> clazz);
}
