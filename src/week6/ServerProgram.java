package week6;

import java.io.*;
import java.net.*;

public class ServerProgram {
    public static void main(String[] args) {
        try {
            ServerSocket server = new ServerSocket(5000);
            System.out.println("Server started. Waiting for client...");

            Socket socket = server.accept();
            System.out.println("Client connected.");

            OutputStream output = socket.getOutputStream();
            PrintWriter writer = new PrintWriter(output, true);
            writer.println("Welcome to the Java Workshop!");

            socket.close();
            server.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
