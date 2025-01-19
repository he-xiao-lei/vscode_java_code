package Hutool;

import cn.hutool.core.io.FileUtil;

import java.io.File;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class HutoolDemo2 {
    public static void main(String[] args) {
        /*
        FileUtil类:
 - file：根据参数创建一个file对象
 - touch：根据参数创建文件
 - writeLines：把集合中的数据写出到文件中，覆盖模式。
 - appendLines：把集合中的数据写出到文件中，续写模式。
 - readLines：指定字符编码，把文件中的数据，读到集合中。
 - readUtf8Lines：按照UTF - 8的形式，把文件中的数据，读到集合中
 - copy：拷贝文件或者文件夹
         */
        File file = FileUtil.file(new File("/home/hexiaolei/aaa"), "b", "c", "d", "fuck.txt");
        System.out.println(file);///home/hexiaolei/aaa/b/c/d/fuck.txt

        File touch = new File("/home/hexiaolei/xxx/xxx/xxx/a.txt");
        //touch命令，如果父级路径不存在，那么会自动创建
        FileUtil.touch(touch);


        //将集合写入文件

        Set<Map.Entry<String, String>> entries = System.getenv().entrySet();
        for (Map.Entry<String, String> entry : entries) {
            System.out.println(entry.getKey());
        }
        //writeLines会覆盖之前的内容
        FileUtil.writeLines(entries,"/home/hexiaolei/aaa/env.txt", StandardCharsets.UTF_8);
        //读取文件内容到集合
        List<String> strings = FileUtil.readLines("/home/hexiaolei/aaa/env.txt", StandardCharsets.UTF_8);
        for (String string : strings) {
            System.out.println(string);
        }

    }
}
