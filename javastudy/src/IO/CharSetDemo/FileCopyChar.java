package IO.CharSetDemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyChar {
    //复制文件(包括子文件夹)
    public static void main(String[] args) throws IOException {
        File source = new File("/home/hexiaolei/aaa/source");
        File dest = new File("/home/hexiaolei/aaa/dest");
        copyFile(source, dest);

    }

    /*
    source数据源
    dest目的地

     */
    public static void copyFile(File source, File dest) throws IOException {
        //判断目的文件夹是否存在，如果不存在就创建
        dest.mkdir();
        File[] src = source.listFiles();
        //判断非空并且循环
        if (src != null) {
            for (File file : src) {
                //是否为文件，如果是文件开始复制
                if (file.isFile()) {
                    //文件输入流 参数:源文件名
                    FileInputStream fip = new FileInputStream(file);
                    //文件输出流，参数:目的文件夹和源文件名
                    FileOutputStream fop = new FileOutputStream(new File(dest, file.getName()));
                    byte[] bytes = new byte[1024];
                    int len;
                    while ((len = fip.read(bytes)) != -1) {
                        fop.write(bytes, 0, len);
                    }
                    fop.close();
                    fip.close();
                } else {
                    copyFile(file,new File(dest,file.getName()));
                }

            }
        }
    }
}
