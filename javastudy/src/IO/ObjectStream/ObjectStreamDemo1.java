package IO.ObjectStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectStreamDemo1 {
    public static void main(String[] args) throws IOException {
        //利用序列化流将一个对象写入到文件中
        /*
        | 构造方法                                    | 说明                 |
| ------------------------------------------- | -------------------- |
| public ObjectOutputStream(OutputStream out) | 把基本流包装为高级流 |

| 成员方法                                    | 说明                           |
| ------------------------------------------- | ------------------------------ |
| `public final void writeObject(Object obj)` | 把对象序列化（写出）到文件中去 |
         */
        //1.创建对象
        Student stu =new Student("hexiaolei",11,"苏州");
        //2.创建序列化流对象
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("/home/hexiaolei/aaa/object.txt"));
        //3.写入数据
        oos.writeObject(stu);
        //4.关流
        oos.close();
    }
}
