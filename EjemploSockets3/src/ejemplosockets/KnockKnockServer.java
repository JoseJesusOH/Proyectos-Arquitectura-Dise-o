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
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Main principal del server
 */
public class KnockKnockServer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try ( ServerSocket serverSocket = new ServerSocket(80)) {
            while (true) {
                new KnockKnockHilo(serverSocket.accept()).start();
            }
        } catch (IOException e) {
            System.err.println("Problema presentado en el puerto;" + 80);
            System.exit(-1);
        }

    }
    
 

}
