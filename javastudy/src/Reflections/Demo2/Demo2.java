package Reflections.Demo2;

import org.hamcrest.core.StringContains;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

public class Demo2 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

        /**
         * #### Class类中用于获取构造方法的方法
         * - `Constructor<?>[] getConstructors()`：返回所有公共构造方法对象的数组
         * - `Constructor<?>[] getDeclaredConstructors()`：返回所有构造方法对象的数组
         * - `Constructor<T> getConstructor(Class<?>... parameterTypes)`：返回单个公共构造方法对象
         * - `Constructor<T> getDeclaredConstructor(Class<?>... parameterTypes)`：返回单个构造方法对象
         *
         * #### Constructor类中用于创建对象的方法
         * - `T newInstance(Object... initargs)`：根据指定的构造方法创建对象
         * - `setAccessible(boolean flag)`：设置为`true`，表示取消访问检查
         */
        //获取class字节码文件对象,
        Class clz = Class.forName("Reflections.Demo2.Demo2Teacher");
        Constructor[] constructors = clz.getConstructors();
        Arrays.stream(constructors).forEach(System.out::println);
        System.out.println("----------------------------");
//        获取所有构造方法(包括protected和private)
        for (Constructor declaredConstructor : clz.getDeclaredConstructors()) {
            System.out.println(declaredConstructor);
        }

        System.out.println("----------------------------");
        //获取单个的
        Constructor constructor = clz.getConstructor();
        System.out.println(constructor);
        Constructor constructor1 = clz.getDeclaredConstructor(String.class);
        System.out.println(constructor1);
        Constructor declaredConstructor = clz.getDeclaredConstructor(String.class, int.class);
        System.out.println(declaredConstructor);

        System.out.println("获取权限修饰符");
        int modifiers = declaredConstructor.getModifiers();
        System.out.println(modifiers);

        System.out.println("获取这个构造方法的参数的个数");
        int parameterCount = declaredConstructor.getParameterCount();
        System.out.println(parameterCount);


        System.out.println("通过constructor对象创建对象");
        //with modifiers "private"，因为上面那个declared只是为了让你看到构造，并不代表可以使用
        //想要使用需要使用以下方式
        //临时取消权限校验
        //暴力反射
        declaredConstructor.setAccessible(true);
        Demo2Teacher o = (Demo2Teacher)declaredConstructor.newInstance("张三", 23);

        System.out.println(o.getName());


    }
}
