import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPServer {
    public static void main(String[] args) {
        try {

            DatagramSocket serverSocket = new DatagramSocket(9876);

            System.out.println("Server waiting for packets...");

            byte[] receiveData = new byte[1024];

            while (true) {

                DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);

                serverSocket.receive(receivePacket);

                String message = new String(receivePacket.getData(), 0, receivePacket.getLength());

                System.out.println("Received message from client: " + message);

                receiveData = new byte[1024];
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
