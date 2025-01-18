package IO.ZipStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class ZipStreamDemo1 {
    public static void main(String[] args) throws IOException {
        //需要解压的文件夹
        File src = new File("/home/hexiaolei/IdeaProjects/vscode_java_code/javastudy/src/IO/ZipStream/bbb.zip");
        //目的路径
        File dest = new File("/home/hexiaolei/IdeaProjects/vscode_java_code/javastudy/src/IO/ZipStream/");
        unzip(src, dest);

    }

    //定义一个方法用来解压
    public static void unzip(File src, File dest) throws IOException {


        //创建一个解压缩流来读取压缩包中的数据
        ZipInputStream zip = new ZipInputStream(new FileInputStream(src));
        //先获取到压缩包里面的每一个ZipEntry对象



        //表示当前在压缩包中获取的文件或者文件夹
        ZipEntry zipEntry;
        while ((zipEntry = zip.getNextEntry()) != null) {
            System.out.println(zipEntry);
                if (zipEntry.isDirectory()){
                    //文件夹：需要在目的地dest处创建一个同样的文件夹
                    File file = new File(dest,zipEntry.getName());
                    file.mkdirs();
                }else {
                    //文件：需要读取到压缩包中的文件，并把他存放到目的地dest文件夹中（按照层级目录进行存放）

                }
        }
    }
}
