package MethodReference.ReferenceArrayConstructorMethod;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.IntFunction;

public class Demo1 {
    public static void main(String[] args) {
        /*
          > 格式:数据类型[]::new

        范例:`int[]::new`

        练习:在集合里面存储一些整数，收集到数组当中
         */
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list,1,2,3,4,5,6);
        Integer[] array = list.stream().toArray(new IntFunction<Integer[]>() {
            @Override
            public Integer[] apply(int value) {
                return new Integer[value];
            }
        });
        System.out.println(Arrays.toString(array));
        //方法引用
        Integer[] array1 = list.stream().toArray(Integer[]::new);
        System.out.println(Arrays.toString(array1));
    }
}
