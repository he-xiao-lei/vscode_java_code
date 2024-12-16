package MethodReference.ReferenceConstructorMethod;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Demo1 {
    public static void main(String[] args) {
        /*
        练习：,集合里面存储姓名和年龄，比如：张无忌，15,要求：将数据封装成Student对象并收集到List集合中
         */
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"张无忌,12","小芳,19","王雷,27","kmg,22");
        List<Demo1Student> list1 = list.stream().map(str -> new Demo1Student(str.split(",")[0], Integer.parseInt(str.split(",")[1]))).collect(Collectors.toList());
        //引用构造方法
        //String-->student
        List<Demo1Student> list2 = list.stream().map(Demo1Student::new).collect(Collectors.toList());
        System.out.println(list1);
        System.out.println(list2);
        list1.forEach(x-> System.out.println(x));
        list1.forEach(System.out::println);

    }
}
