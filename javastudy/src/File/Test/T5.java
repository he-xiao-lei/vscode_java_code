package File.Test;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class T5 {
    public static void main(String[] args) {
        /*
        统计一个文件夹中每一种文件的个数并打印。（考虑子文件夹）
        格式如下:
                txt:1
                jpg:2
                jpg:6
         */
        File file = new File("/home/hexiaolei/aaa/");
        countFile(file).forEach((x, y) -> System.out.println(x + " " + y));


        long len = getLen(file);
        System.out.println("len(文件总字节大小) = " + len);
    }

    public static HashMap<String, Integer> countFile(File file) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        File[] src = file.listFiles();
        if (src != null) {
            for (File f : src) {
                //是文件
                if (f.isFile()) {
                    //获取后缀名,并判断是否是文件
                    String[] split = f.getName().split("\\.");
                    //避免没有文件后缀名的情况
                    if (split.length >= 2) {
                        //避免类似a.a.txt之类的文件
                        String suffix = split[split.length - 1];
//                    String suffix = f.getName().split("\\.")[1];
                        if (hashMap.containsKey(suffix)) {
                            Integer i = hashMap.get(suffix);
                            i++;
                            hashMap.put(suffix, i);
                        } else {
                            //不存在就加
                            hashMap.put(suffix, 1);
                        }
                    }

                } else {
                    //不是文件，递归
                    //sonHashmap是子文件夹中每一种文件的个数
                    HashMap<String, Integer> sonHashMap = countFile(f);
                    // 遍历sonHashmap 将里面所有内容添加到hashmap中
                    //hashMap:txt 1 , jpg 2 ,doc 3
                    //sonHashMap:txt 2, jpg ,doc 4
                    //把sonHashMap的内容添加到原来的hashmap中
                    for (Map.Entry<String, Integer> x : sonHashMap.entrySet()) {
                        String key = x.getKey();
                        Integer value = x.getValue();
                        if (hashMap.containsKey(key)) {
                            //存在
                            int count = hashMap.get(key);
                            count = count + value;
                            hashMap.put(key, count);
                        } else {
                            //不存在
                            hashMap.put(key, value);
                        }
                    }
                }
            }
        }
        return hashMap;
    }

    public static long getLen(File file) {
        long length = 0L;
        File[] src = file.listFiles();
        if (src != null)
            for (File f : src) {
                if (f.isFile()) {
                    //方法返回文件字节数
                    length += f.length();
                } else {
                    //需要这样子是因为，如果第二次调用时length会变成0,导致只会有一个文件夹下文件的字节数大小
                    length += getLen(f);
                }
            }
        return length;
    }
}
