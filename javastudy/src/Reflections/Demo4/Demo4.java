package Reflections.Demo4;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class Demo4 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, NoSuchFieldException, InvocationTargetException, IllegalAccessException {
        /**
         * #### Class类中用于获取成员方法的方法
         * - `Method[] getMethods()`：返回所有公共成员方法对象的数组，包括继承的
         * - `Method[] getDeclaredMethods()`：返回所有成员方法对象的数组，不包括继承的
         * - `Method getMethod(String name, Class<?>... parameterTypes)`：返回单个公共成员方法对象
         * - `Method getDeclaredMethod(String name, Class<?>... parameterTypes)`：返回单个成员方法对象
         *
         * #### Method类中用于创建对象的方法
         * - `Object invoke(Object obj, Object... args)`：运行方法
         *     - 参数一：用`obj`对象调用该方法
         *     - 参数二：调用方法的传递的参数（如果没有就不写）
         *     - 返回值：方法的返回值（如果没有就不写）
         *
         *     - 获取方法的修饰符
         * - 获取方法的名字
         * - 获取方法的形参
         * - 获取方法的返回值
         * - 获取方法抛出的异常
         */


        Class clazz = Class.forName("Reflections.Demo4.Demo4Class");

        for (Method method : clazz.getMethods()) {//所有公共的方法，包括父类继承的
            System.out.println("method = " + method);
        }
        Method[] declaredMethods = clazz.getDeclaredMethods();//所有的方法(包含私有)，不包含继承的
        for (Method declaredMethod : declaredMethods) {
            System.out.println("declaredMethod = " + declaredMethod);
        }


        //获取修饰符
        //单个
        Method sleep = clazz.getMethod("sleep");
        int modifiers = sleep.getModifiers();
        System.out.println("modifiers = " + modifiers);


        Method say = clazz.getDeclaredMethod("say", String.class);
        int modifiers1 = say.getModifiers();
        System.out.println("modifiers1 = " + modifiers1);

        //获取方法名字
        String name = say.getName();
        System.out.println(name);
        //获取方法形参
        for (Parameter parameter : say.getParameters()) {
            System.out.println(parameter);
        }

        //获取方法抛出的异常
        /**
         * 反射获取异常类型
         * 反射机制能够在运行时检查类、方法、字段等信息。Method类中的getExceptionTypes()方法会返回一个Class数组，该数组包含了方法声明中使用throws关键字列出的所有异常类型。
         */
        Class[] exceptionTypes = say.getExceptionTypes();
        for (Class exceptionType : exceptionTypes) {
            System.out.println(exceptionType);
        }


        //让方法运行起来
        Demo4Class d4 = new Demo4Class("a",13,"c");
        say.setAccessible(true);
        //方法调用者
        Object invoke = say.invoke(d4, "hahaha");
        System.out.println(invoke);


    }
}
