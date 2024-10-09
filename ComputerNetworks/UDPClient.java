package ComputerNetworks;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPClient {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds = new DatagramSocket();

        int i = 89;
        byte[] b = String.valueOf(i).getBytes();
        byte[] b1 = new byte[1024];
        InetAddress ia = InetAddress.getLocalHost();

        DatagramPacket dp = new DatagramPacket(b, b.length, ia, 8000);

        ds.send(dp);
        DatagramPacket dp1 = new DatagramPacket(b1, b1.length);

        ds.receive(dp1);

        String response = new String(dp1.getData());
        System.out.println("Response from UDP server: " + response);

    }
}
