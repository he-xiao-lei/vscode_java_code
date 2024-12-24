package File.Test;

import java.io.File;
import java.io.IOException;

public class T1 {
    public static void main(String[] args) throws IOException {
        //创建父级路径
        File f = new File("/home/hexiaolei/aaa");
        //会自动判断这个文件夹存不存在，不存在创建成功,若已经存在返回失败
        f.mkdirs();

        //在aaa文件夹下创建a.txt
        //拼接路径
        File file = new File(f,"a.txt");
        System.out.println("文件是否存在="+file.exists());
        System.out.println("file.createNewFile() = " + file.createNewFile());
        System.out.println("文件是否存在="+file.exists());





    }
}
