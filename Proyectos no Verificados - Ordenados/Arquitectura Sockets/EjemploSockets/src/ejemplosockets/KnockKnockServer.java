/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplosockets;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;


/**
 *
 * @author gilberto.borrego
 */
public class KnockKnockServer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try {
            ServerSocket serverSocket = null;
            serverSocket = new ServerSocket(4444);
	    System.out.println("estoy después de crear el socket");
            Socket clientSocket = null;

            clientSocket = serverSocket.accept();
	    System.out.println("estoy después de aceptar un cliente");

            PrintWriter out = null;
            BufferedReader in = null;

            out = new PrintWriter(clientSocket.getOutputStream(), true);
            in = new BufferedReader(new InputStreamReader(
				clientSocket.getInputStream()));            

            String inputLine, outputLine;
            KnockKnockProtocol kkp = new KnockKnockProtocol();

            outputLine = kkp.processInput(null);
            out.println(outputLine);

            while ((inputLine = in.readLine()) != null) {
                outputLine = kkp.processInput(inputLine);
                out.println(outputLine);
                if (outputLine.equals("Bye."))
                    break;
            }
            out.close();
            in.close();
            clientSocket.close();
            serverSocket.close();            
        } catch (IOException e) {
            System.err.println("Could not listen on port: 4444.");
            System.exit(1);
        }
    }    
}



    

