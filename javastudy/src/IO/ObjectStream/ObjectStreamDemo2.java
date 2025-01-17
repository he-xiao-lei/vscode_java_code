package IO.ObjectStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectStreamDemo2 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        /*
        > 可以把序列化到本地文件的对象,读取到程序里面



| 构造方法                                    | 说明               |
| ------------------------------------------- | ------------------ |
| `public ObjectInputStream(InputStream out)` | 把基本流变成高级流 |

| 成员方法                     | 说明                                       |
| ---------------------------- | ------------------------------------------ |
| `public Object readObject()` | 把序列化到本地文件中的对象，读取到程序中来 |
         */

        //创建反序列化对象，并且关联序列化到本地文件的对象
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("/home/hexiaolei/aaa/object.txt"));
        //读取对象并且强制转换
        Student o = (Student) ois.readObject();
        //打印对象
        System.out.println(o);
    }
}
