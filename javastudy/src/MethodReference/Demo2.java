package MethodReference;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Function;

public class Demo2 {
    public static void main(String[] args) {
        /*
        方法引用:(静态方法)
        格式:类::方法名
        集合中有以下类型数据,"1","2","3","4","5"
        变成int类型输出
         */
        //添加元素
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"1","2","3","4","5");
        //都变成int类型,匿名内部类形式
        list.stream().map(new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return Integer.parseInt(s);
            }
        }).forEach(System.out::println);
        //方法引用方式
        list.stream()
                .map(Integer::parseInt)
                .forEach(System.out::println);
    }

}
