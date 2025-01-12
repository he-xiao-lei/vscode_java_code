package IO.CharSetDemo;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class sortFile {
    public static void main(String[] args) throws IOException {
        //将2-3-1-4-7-8转换为有顺序的
        //1-2-3-4-7-8
        FileReader fr = new FileReader("/home/hexiaolei/aaa/a.txt");
        FileWriter fw = new FileWriter("/home/hexiaolei/aaa/a_result.txt");
        StringBuilder strb = new StringBuilder();
        int ch;
        while ((ch = fr.read()) != -1) {
            if (ch == '\n' || ch == '\r') {
                break;
            }
            strb.append((char) ch);
        }
        System.out.println(strb);

        //排序
        String string = strb.toString();
        String[] arr = string.split("-");
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            int i1 = Integer.parseInt(arr[i]);
            list.add(i1);
        }
        Collections.sort(list);
        System.out.println(list);
        //写出
        for (int i = 0; i < list.size(); i++) {
            if (i == list.size() - 1) {
                //变成字符串是原样写出
                fw.write(list.get(i) + "");
            } else {
                fw.write(list.get(i) + "-");
            }
        }
        fw.close();
        fr.close();
    }

}
