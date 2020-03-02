package org.example;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.util.ObjectUtil;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.support.hsf.HSFJSONUtils;
import jdk.nashorn.internal.parser.JSONParser;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

public class TestPrototype {

    public static void main(String[] args) throws InterruptedException {

        User user = new User("armson","MeiZhou",29);
        user.setHobbies(Arrays.asList("足球","网络游戏"));
        Thread.sleep(1000L);

        String j = JSONObject.toJSONString(user);
        System.out.println("json str"+j);
        JSONObject parse = (JSONObject)JSONObject.parse(j);
        JSONArray hobbies = parse.getJSONArray("hobbies");
        List<String> strings = hobbies.toJavaList(String.class);
        User userPrototype = parse.toJavaObject(User.class);
        userPrototype.setHobbies(strings);
        System.out.println();
        System.out.println("prototype obj name:"+userPrototype.getName());
        System.out.println("prototype obj org:"+userPrototype.getOrg());
        System.out.println("prototype obj age:"+userPrototype.getAge());
        System.out.println("prototype obj hobbies:"+userPrototype.getHobbies());
        System.out.println(user == userPrototype);
        System.out.println(user.getHobbies() == userPrototype.getHobbies());
    }
}
