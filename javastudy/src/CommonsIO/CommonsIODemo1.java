package CommonsIO;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CommonsIODemo1 {
    public static void main(String[] args) throws IOException {
        /*
        | FileUtils 类（文件 / 文件夹相关）                            | 说明                       |
| ------------------------------------------------------------ | -------------------------- |
| static void copyFile(File srcFile, File destFile)            | 复制文件                   |
| static void copyDirectory(File srcDir, File destDir)         | 复制文件夹                 |
| static void copyDirectoryToDirectory(File srcDir, File destDir) | 复制文件夹                 |
| static void deleteDirectory(File directory)                  | 删除文件夹                 |
| static void cleanDirectory(File directory)                   | 清空文件夹                 |
| static String readFileToString(File file, Charset encoding)  | 读取文件中的数据变成字符串 |
| static void write(File file, CharSequence data, String encoding) | 写出数据                   |

| IOUtils 类（流相关）                                         | 说明       |
| ------------------------------------------------------------ | ---------- |
| public static int copy(InputStream input, OutputStream output) | 复制文件   |
| public static int copyLarge(Reader input, Writer output)     | 复制大文件 |
| public static String readLines(Reader input)                 | 读取数据   |
| public static void write(String data, OutputStream output)   | 写出数据   |
         */

        FileUtils.copyFile(new File("/home/hexiaolei/aaa/a.txt"),new File("/home/hexiaolei/bbb/bbb.txt"));
        FileUtils.copyDirectoryToDirectory(new File("/home/hexiaolei/aaa"),new File("/home/hexiaolei/aaa/b"));
        IOUtils.copy(new FileReader("/home/hexiaolei/download/iso_file/CentOS-7-x86_64-DVD-2009.iso"),new FileWriter("/home/hexiaolei/aaa.iso"));
    }
}
