package IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class NewTCF {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("/home/hexiaolei/RosanMedia.mp4");
        FileOutputStream fileOutputStream = new FileOutputStream("/home/hexiaolei/a.iso");
        try (fileOutputStream; fileInputStream) {//写在这里面的对象(的类需要继承AutoCloseable接口)，方法执行结束后会自动释放资源
            byte[] bytes1 = new byte[1024 * 1024 * 5];
            int len;
            while ((len = fileInputStream.read(bytes1)) != -1) {
                fileOutputStream.write(bytes1, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
