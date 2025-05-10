package internTasks.chatApplication;
import java.io.*;
import java.net.*;
import java.util.*;
public class serverCode {
        private static Set<PrintWriter> clientWriters = new HashSet<>();

        public static void main(String[] args) {
            try (ServerSocket serverSocket = new ServerSocket(12345)) {
                System.out.println("Chat server started...");

                while (true) {
                    Socket socket = serverSocket.accept();
                    new ClientHandler(socket).start();
                }
            } catch (IOException e) {
                System.out.println("Error starting server: " + e.getMessage());
            }
        }

        private static class ClientHandler extends Thread {
            private Socket socket;
            private PrintWriter out;
            private BufferedReader in;

            public ClientHandler(Socket socket) {
                this.socket = socket;
            }

            public void run() {
                try {
                    in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                    out = new PrintWriter(socket.getOutputStream(), true);

                    synchronized (clientWriters) {
                        clientWriters.add(out);
                    }

                    String message;
                    while ((message = in.readLine()) != null) {
                        System.out.println("Received: " + message);
                        synchronized (clientWriters) {
                            for (PrintWriter writer : clientWriters) {
                                writer.println(message);
                            }
                        }
                    }
                } catch (IOException e) {
                    System.out.println("Client disconnected.");
                } finally {
                    try {
                        socket.close();
                    } catch (IOException e) {
                        System.out.println("Error closing socket: " + e.getMessage());
                    }
                }
            }
        }
}
