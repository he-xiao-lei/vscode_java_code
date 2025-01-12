package IO.CharSetDemo;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class newSortFile {
    public static void main(String[] args) throws IOException {
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


        Integer[] array = Arrays.stream(strb.toString().split("-"))
                .map(Integer::parseInt)
                .sorted()
                .toArray(Integer[]::new);

        String str = Arrays.toString(array).replace(", ","-");
        String result = str.substring(1, str.length() - 1);


        fw.write(result);
        fw.close();
        fr.close();

    }
}
