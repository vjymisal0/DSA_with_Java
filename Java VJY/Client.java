import java.io.*;
import java.net.*;

public class Client {
    public static void main(String[] args) {
        try {
            // Create a socket and connect to the server
            Socket clientSocket = new Socket("localhost", 8080);
            System.out.println("Connected to server.");

            // Create input and output streams for communication with the server
            BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);

            // Send a message to the server
            String message = "Hello, server! This is the client.";
            out.println(message);
            System.out.println("Message sent: " + message);

            // Receive and print the response from the server
            String response = in.readLine();
            System.out.println("Server response: " + response);

            // Close the connection with the server
            clientSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
