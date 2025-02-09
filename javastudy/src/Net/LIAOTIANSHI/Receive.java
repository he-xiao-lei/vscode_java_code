package Net.LIAOTIANSHI;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Receive {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds = new DatagramSocket(65535);

        byte[] bytes = new byte[1024];

        DatagramPacket dp = new DatagramPacket(bytes,bytes.length);

        while (true) {
            ds.receive(dp);
            System.out.println("数据 = "+new String(dp.getData(),0,dp.getLength()));
            System.out.println("源ip和端口"+dp.getAddress()+"\t"+dp.getPort());
        }


    }
}
