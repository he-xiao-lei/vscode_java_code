package File;

import java.io.File;
import java.util.Arrays;

public class File05_1 {
    public static void main(String[] args) {
        /*
| `*(掌握)public File[] listFiles()`               | 获取当前该路径下所有内容                 |
| ------------------------------------------------ | ---------------------------------------- |

         */
        //1.创建File对象
        File file = new File("/home/hexiaolei/JavaTestFile/");
        //2.打印里面所有.txt文本文件
        File[] files = file.listFiles();
        for (File file1 : files) {
            if (file1.isFile() && file1.getName().endsWith(".txt")) System.out.println(file1);
        }
        File f = new File("/e");
        File[] files1 = f.listFiles();
        System.out.println(Arrays.toString(files1));
        System.out.println(files1);
    }
}
