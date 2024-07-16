/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplosocketpropio;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.Socket;
import java.util.Observable;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Cliente implements Runnable {

    private int puerto;

    public Cliente(int puerto) {
        this.puerto = puerto;
    }

    @Override
    public void run() {
        //Host del servidor
        final String HOST = "127.0.0.1";
        try {
            Socket sc = new Socket(HOST, puerto);
            ObjectInputStream ois = new ObjectInputStream(sc.getInputStream());
            while (true) {
                Prueba p = (Prueba) ois.readObject();
                System.out.println(p.toString());
            }

        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
