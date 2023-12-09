import java.io.*;
import java.net.*;

public class Server {
    public static void main(String[] args) {
        try {
            // Create a server socket
            ServerSocket serverSocket = new ServerSocket(8080);
            System.out.println("Server listening on port 8080...");

            // Wait for a client to connect
            Socket clientSocket = serverSocket.accept();
            System.out.println("Connection from " + clientSocket.getInetAddress().getHostAddress());

            // Create input and output streams for communication with the client
            BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);

            // Receive and print data from the client
            String data = in.readLine();
            System.out.println("Received: " + data);

            // Send a response back to the client
            String response = "Hello, client! Your message has been received.";
            out.println(response);

            // Close the connection with the client
            clientSocket.close();
            serverSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
