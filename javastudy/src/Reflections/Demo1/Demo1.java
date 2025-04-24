package Reflections.Demo1;

public class Demo1 {
    public static void main(String[] args) throws ClassNotFoundException {
        /**
         * 1. Class.forName("全类名")
         *     - 使用场景:源代码阶段，还没有编译运行
         * 2. 类名.class
         *     - 加载阶段
         * 3. 对象.getClass();
         *     - 运行阶段
         */
        //1
        Class cls = Class.forName("Reflections.Demo1.Teacher");
        //打印结果
        System.out.println(cls);


        //2更多当作参数用来传递
        Class<Teacher> teacherClass = Teacher.class;
        System.out.println(teacherClass);

        //3当我们已经有了这个类的对象时才可以使用
        Teacher t = new Teacher();
        Class<? extends Teacher> aClass = t.getClass();
        System.out.println(aClass);
        System.out.println(aClass==teacherClass && teacherClass==cls);

    }
}
