package File;

import java.io.File;
import java.io.IOException;

public class File03 {
    public static void main(String[] args) throws IOException {
        /*
        | 方法名称                         | 说明                 |
| -------------------------------- | -------------------- |
| `public boolean createNewFile()` | 创建一个新的空的文件 |
| `public boolean mkdir()`         | 创建单级文件夹       |
| `public boolean mkdirs()`        | 创建多级文件夹       |
| `public boolean delete()`        | 删除文件、空文件夹   |
         */
        //delete方法默认只能删除文件和空文件夹，不走回收站
        //细节1如果文件不存在，返回true，创建成功，如果存在，返回false,创建失败，因为已经存在
        //细节2:如果父路径找不到，会报IOException
        //例子:/home/hexiaolei/xxx/lll.txt 这里的xxx不存在
        //细节3:createNewFile()创建的一定是文件，如果是创建的类似ddd之类的，就会创建出没有后缀名的ddd文件
        File f = new File("/home/hexiaolei/JavaTestFile/lll.txt");
        System.out.println("文件是否存在:"+f.exists());
        boolean newFile = f.createNewFile();
        System.out.println("文件是否创建成功:"+newFile);
        System.out.println("文件是否存在:"+f.exists());

        //mkdir() make Directory 文件夹（目录）
        //细节1：路径唯一，不可以有同名文件或者同名文件夹, 会返回false
        //细节2：不可以递归创建文件夹,会返回false
        File f1 = new File("/home/hexiaolei/JavaTestFile/directory");
        System.out.println("文件夹是否创建成功:"+f1.mkdir());
        //mkdirs() mkdir Directories 创建多级文件夹
        //细节:可以创建单级，也可以创建多级目录，底层会调用mkdir方法
        File f2 = new File("/home/hexiaolei/JavaTestFile/aaab//aaa/aaa/aaa/aa/aa");
        System.out.println("创建是否成功:"+f2.mkdirs());
    }
}
