package Hutool;

import cn.hutool.system.UserInfo;

import java.lang.reflect.Method;
import java.util.Arrays;

public class HutoolDemo3 {
    public static void main(String[] args) {
        /*
        随便玩玩
         */
//        Console.printProgress('-',100);
        Class<?> userinfo = UserInfo.class;
        Method[] methods = userinfo.getMethods();
        Arrays.stream(methods).forEach(System.out::println);
        UserInfo userInfo = new UserInfo();
        System.out.println(userInfo.getCountry());

    }
}
