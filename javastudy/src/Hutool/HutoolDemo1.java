package Hutool;

import cn.hutool.Hutool;

import java.util.Set;

public class HutoolDemo1 {
    public static void main(String[] args) {
        Set<Class<?>> allUtils = Hutool.getAllUtils();
        for (Class<?> allUtil : allUtils) {
            System.out.println(allUtil);
        }
//        HttpUtil.createServer(8888).addAction("/",((httpServerRequest, httpServerResponse) -> httpServerResponse.write("HelloWorld"))).start();

    }
}
