/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplosocketpropio;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Judi
 */
public class Servidor  implements Runnable {
    
    private ArrayList<Socket> clientes;

    private int puerto;

    public Servidor(int puerto) {
        this.puerto = puerto;
        this.clientes = new ArrayList();
    }

    @Override
    public void run() {

        ServerSocket servidor = null;
        Socket sc = null;
        DataInputStream in;

        try {
            //Creamos el socket del servidor
            servidor = new ServerSocket(puerto);
            System.out.println("Servidor iniciado");

            //Siempre estara escuchando peticiones
            while (true) {
                sc = servidor.accept();
                System.out.println("Cliente conectado");
                clientes.add(sc);

            }

        } catch (IOException ex) {
            Logger.getLogger(Servidor.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
