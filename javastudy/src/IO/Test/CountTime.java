package IO.Test;

import java.io.*;

public class CountTime {
    public static void main(String[] args) throws IOException {
        //IO使用原则：随用随创建
        //1.关联文件
        BufferedReader br = new BufferedReader(new FileReader("/home/hexiaolei/aaa/count.txt"));
        //2.逻辑
        String line = br.readLine();
        int count = Integer.parseInt(line);
        //表示又运行了一次
        count++;
        if (count >= 3) {
            System.out.println("超过三次,请付费");
        } else {
            System.out.println("欢迎第"+count+"次使用");
        }
//        System.out.println(read);
        BufferedWriter bw = new BufferedWriter(new FileWriter("/home/hexiaolei/aaa/count.txt"));
        //写入时要加上双引号作为str字符串传入，否则如果直接传进去数字为转化为ascii码写入
        bw.write(count+"");

        //3.关流
        br.close();
        bw.close();
    }
}
