package IO.ObjectStream.test;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Test2 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //创建反序列化流对象
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("/home/hexiaolei/aaa/student.txt"));
        ArrayList<Student> list= (ArrayList<Student>) ois.readObject();


        for (Student student : list) {
            System.out.println(student.toString());
        }
    }
}
