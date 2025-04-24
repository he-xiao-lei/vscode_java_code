package Reflections.Demo3;

import java.lang.reflect.Field;

public class Demo3 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        /**
         * ### 利用反射获取成员变量
         * #### Class类中用于获取成员变量的方法
         * - `Field[] getFields()`：返回所有公共成员变量对象的数组
         * - `Field[] getDeclaredFields()`：返回所有成员变量对象的数组
         * - `Field getField(String name)`：返回单个公共成员变量对象
         * - `Field getDeclaredField(String name)`：返回单个成员变量对象
         *
         * #### Field类中用于创建对象的方法
         * - `void set(Object obj, Object value)`：赋值
         * - `Object get(Object obj)`：获取值
         */
        //获取字节码文件
        Class clazz = Class.forName("Reflections.Demo3.Deomo3Bean");

        for (Field field : clazz.getFields()) {
            System.out.println("公共的变量:"+ field);
        }
        //获取所有成员变量
        for (Field declaredField : clazz.getDeclaredFields()) {
            System.out.println("declaredField = " + declaredField);
        }
        //获取单个
        System.out.println("获取单个");
        Field name1 = clazz.getDeclaredField("name");
        String name = name1.getName();
        System.out.println(name);
//        获得权限修饰符
        int modifiers = name1.getModifiers();
        System.out.println(modifiers);

        System.out.println("获取成员变量数据类型");
        Class<?> type = name1.getType();
        System.out.println(type);

        System.out.println("获取成员变量记录的值");
        Deomo3Bean d3 = new Deomo3Bean("zhangsan",13,"北京",true);
        name1.setAccessible(true);
        Object o = name1.get(d3);
        System.out.println(o);

        System.out.println("修改原来对象里面的值");
        name1.set(d3,"张三");
        Object o1 = name1.get(d3);
        System.out.println(o1);


    }
}
