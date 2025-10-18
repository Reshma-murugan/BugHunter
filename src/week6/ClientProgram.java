package week6;

import java.io.*;
import java.net.*;

public class ClientProgram {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 5000);

            InputStream input = socket.getInputStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(input));

            String message = reader.readLine();
            System.out.println("Message from Server: " + message);

            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

