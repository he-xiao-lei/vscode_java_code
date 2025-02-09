package Net.ZUBUO;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

public class Send {
    public static void main(String[] args) throws IOException {
        /*
        组播发送端代码
         */
        MulticastSocket ms = new MulticastSocket();


        //创建DatagramPacket对象
        String s = "HelloWorld";
        byte[] bytes = s.getBytes();
        InetAddress ip = InetAddress.getByName("224.0.0.2");
        int port = 10000;
        DatagramPacket dp = new DatagramPacket(bytes,bytes.length,ip,port);

        //发送数据
        ms.send(dp);
        ms.close();
    }
}
