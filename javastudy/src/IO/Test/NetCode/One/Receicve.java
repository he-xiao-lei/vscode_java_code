package IO.Test.NetCode.One;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Receicve {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(20000);

        Socket accept = serverSocket.accept();

        InputStreamReader isr = new InputStreamReader(accept.getInputStream());
        int b;
        while ((b=isr.read())!=-1){
            System.out.print((char)b);

        }
        accept.close();
        serverSocket.close();
    }
}
