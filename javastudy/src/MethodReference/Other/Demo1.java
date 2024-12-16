package MethodReference.Other;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Demo1 {
    public static void main(String[] args) {
        /*
        方法引用(类名引用成员方法)
        将集合内小写字母转化为大写字母
        方法引用的规则:这种方式特有的
        1.要有函数式接口
        2.被引用方法必须已经存在
        3.被引用方法的形参，需要跟抽象方法的第二个形参到最后一个形参相同,返回值保持一致
        4.被引用方法功能需要满足当前的需求
        抽象方法形参详细解释:
        第一个参数:表示被引用方法的调用者,决定可以引用哪些类中的方法
            在Stream流中，第一个参数一般都表示流里面的每一个数据(String s)
            假设流里面的类型是字符串,那么使用这种方式进行方法引用，只能引用String类中的方法
        第二个参数到最后一个参数:跟被引用方法(String::toUpperCase)的形参保持一致，如果没有，那么被引用的方法就要是无参的成员方法

        局限性:
        不能引用所有类中的成员方法,
        是跟抽象方法的第一个参数有关系,这个参数是什么类型的，那么只能引用这个类里面的方法
         */


        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"aaa","bbb","ccc");
        List<String> collect = list.stream().map(new Function<String, String>() {
            @Override
            public String apply(String s) {
                return s.toUpperCase();
            }
        }).collect(Collectors.toList());
        System.out.println(collect);
        //方法引用
        //拿着流里面每一个数据，调用String类中的toUpperCase方法，方法的返回值就是转换之后的结果
        List<String> collect1 = list.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(collect1);
        collect1.forEach(System.out::println);
    }
}
