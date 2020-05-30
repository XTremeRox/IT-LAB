package connect_server;
import java.net.InetAddress;
import java.net.Socket;
public class Connect_with_server {
    public static void main(String[] args) {
        try {
            InetAddress addr;
            //trying to connect a website
            Socket sock = new Socket("www.soren.in", 80);
            addr = sock.getInetAddress();
            System.out.println("Success! Connected to " + addr);
            sock.close();
        } catch (java.io.IOException e) {
            System.out.println("Error! Failed connecting to " + args[0]);
            System.out.println(e);
        }
    }
}