package MethodReference;

import java.util.Arrays;

public class Demo1 {
    public static void main(String[] args) {
        //创建一个数据倒序输出
        Integer[] integers = new Integer[]{1, 2, 3, 4, 5};

        //匿名内部类
//        Arrays.sort(integers, new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return o2 - o1;
//            }
//        });
//        System.out.println(Arrays.toString(integers));
//        //Lambda
//        Arrays.sort(integers, (Integer o1, Integer o2) -> {
//            return o2 - o1;
//        });
//        //Lambda简化
//        Arrays.sort(integers, ((o1, o2) -> o2 - o1));

        //方法引用
        //1调用处必须是函数式接口
        //2被引用的方法需要存在
        //3被引用方法的形参和返回值需要和抽象方法的形参和返回值保持一致
        //4被引用方法的功能需要满足当前的需求
        //引用了Demo1里面的subtraction方法
        //把这个方法作为抽象方法的方法体
        Arrays.sort(integers,Demo1::subtraction);
        System.out.println(Arrays.toString(integers));

    }
    //可以是Java写好的,也可以是第三方工具类
    public static int subtraction(int n1,int n2){
        return n2-n1;
    }
}
