package IO.Test;

import java.io.*;
import java.util.Map;
import java.util.TreeMap;

public class csb {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("/home/hexiaolei/aaa/csb.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("/home/hexiaolei/aaa/csb_ok.txt"));
        TreeMap<Integer, String> map = new TreeMap<>();
        String line;
        while ((line = br.readLine()) != null) {
            String[] split = line.split("\\.");
            int key = Integer.parseInt(split[0]);
            //如果想要键是一整句话，可以把这个的split[1]写为line
            String value = split[1];
            map.put(key, value);
        }

//        map.forEach((x,y)-> System.out.println(x+":"+y));
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            //然后这里可以只写entry.getValue()
            bw.write(entry.getKey() + "." + entry.getValue());
            bw.newLine();
        }
        bw.close();
        br.close();
    }
}
