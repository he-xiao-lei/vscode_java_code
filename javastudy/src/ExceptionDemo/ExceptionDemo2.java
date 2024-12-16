package ExceptionDemo;

public class ExceptionDemo2 {
    /*
   作用0:异常是用来**查询Bug的关键参考信息**

    作用1:异常可以作为方法内部的**一种特殊返回值**，**以便通知调用者底层的执行情况**
     */
    public static void main(String[] args) {
        Student student = new Student("张三,11");
        System.out.println(student);
    }
}
