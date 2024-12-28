package IO;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo1 {
    public static void main(String[] args) throws IOException {
        /**
         * | `void write(int b)`                      | 一次写一个字节数据           |
         * | `void write(byte[] b)`                   | 一次写一个字节数组数据       |
         * | `void write(byte[] b, int off, int len)` | 一次写一个字节数组的部分数据 |
         */
        // 方式 1
        //创建对象
        FileOutputStream fos = new FileOutputStream("/home/hexiaolei/aaa/a.txt");
        //写入数据
        fos.write(99);
        fos.write(99);
        //释放资源
//        fos.close();

        // 方式 2
        byte[] bytes = {12,33,22,22,33,11,22,33,33,11};
        fos.write(bytes);

        // 方式3
        //解释：
            //参数1：需要读取的文件,
            //参数2：起始索引
            //参数3：读取个数
        fos.write(bytes,1,2);
        fos.close();
    }
}
