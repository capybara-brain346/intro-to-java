package ComputerNetworks;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPServer {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds = new DatagramSocket(8000);

        byte[] b1 = new byte[1024];

        DatagramPacket dp = new DatagramPacket(b1, b1.length);
        ds.receive(dp);
        String request = new String(dp.getData());
        int num = Integer.parseInt(request.trim());
        int result = (int) Math.pow(num, 2);
        byte[] b2 = (result + "").getBytes();

        InetAddress ia = InetAddress.getLocalHost();
        DatagramPacket dp1 = new DatagramPacket(b2, b2.length, ia, dp.getPort());
        ds.send(dp1);

    }
}
