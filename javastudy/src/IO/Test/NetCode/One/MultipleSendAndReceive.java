package IO.Test.NetCode.One;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class MultipleSendAndReceive {
    public static void main(String[] args) throws IOException {


        Socket socket = new Socket("127.0.0.1",20000);
        OutputStream outputStream = socket.getOutputStream();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入你要发送的内容");
            String s = sc.nextLine();
            if ("886".equals(s)) {
                break;
            }
            outputStream.write(s.getBytes());
        }

        socket.close();
    }
}
