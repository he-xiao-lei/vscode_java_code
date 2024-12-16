package MethodReference.Test.T1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class T1 {
    public static void main(String[] args) {
        /*
        练习1的内容是关于方法引用的编程练习。具体要求如下：

    集合中存储一些字符串格式的数据，例如："张三,23"。
    将这些字符串数据收集到一个Student类型的数组中。
    完成这个任务需要使用方法引用。
         */
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"张三,22","李四,11","张宝,22");
        T1Student[] array = list.stream().map(T1Student::new).toArray(T1Student[]::new);
//        Student[] array1 = list.stream().map(Student::new).toArray(new IntFunction<Student[]>() {
//            @Override
//            public Student[] apply(int value) {
//                return new Student[value];
//            }
//        });
        System.out.println(Arrays.toString(array));
    }
}
