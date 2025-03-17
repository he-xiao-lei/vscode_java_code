package Net.LIAOTIANSHI;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class Send {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds = new DatagramSocket();

        Scanner sc = new Scanner(System.in);

        while (true) {
            String str = sc.nextLine();
            if (str.equals("886")){
                break;
            }
            byte[] data = str.getBytes();
            InetAddress ip = InetAddress.getByName("127.0.0.1");
            int port = 65535;
            DatagramPacket dp = new DatagramPacket(data, data.length, ip, port);
            ds.send(dp);
        }



    }
}
