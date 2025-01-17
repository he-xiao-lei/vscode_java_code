package IO.ObjectStream.test;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class test1 {
    public static void main(String[] args) throws IOException {
        //将多个自定义对象序列化到文件中,但是对象的个数不确定


        //1.序列化多个对象
        Student s1 = new Student("h", 1, "苏州");
        Student s2 = new Student("x", 2, "北京");
        Student s3 = new Student("l", 4, "南极");
        //2.创建序列化流对象
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("/home/hexiaolei/aaa/student.txt"));
        //在反序列化时不知道对象有几个的时候，可以在序列化时将对象都放入一个arraylist里面，然后序列化这个arraylist对象然后在读取时使用增强for即可
        ArrayList<Student> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        oos.writeObject(list);
        oos.close();
    }
}
