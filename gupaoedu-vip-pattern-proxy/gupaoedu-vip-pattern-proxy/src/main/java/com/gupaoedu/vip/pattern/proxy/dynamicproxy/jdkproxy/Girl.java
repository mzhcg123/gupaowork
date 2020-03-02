package com.gupaoedu.vip.pattern.proxy.dynamicproxy.jdkproxy;

import com.gupaoedu.vip.pattern.proxy.Person;

/**
 * Created by Tom on 2019/3/10.
 */
public class Girl implements Person {
    public void findLove(String msg) {
        System.out.println("高富帅");
        System.out.println("身高180cm");
        System.out.println("有6块腹肌");
        System.out.println(msg);
    }
}
