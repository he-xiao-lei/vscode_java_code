package IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


public class tcf {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        try {
            //因为创建流时，文件有可能因为不存在导致异常,所以要写在里面
            fileInputStream = new FileInputStream("/home/hexiaolei/RosanMedia.mp4");
            fileOutputStream = new FileOutputStream("/home/hexiaolei/video.mp4");
            byte[] bytes1 = new byte[1024 * 1024 * 5];
            int len;
            while ((len = fileInputStream.read(bytes1)) != -1) {
                fileOutputStream.write(bytes1, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        //接口:AutoCloseable
        //特定情况下会自动释放资源

    }
}


