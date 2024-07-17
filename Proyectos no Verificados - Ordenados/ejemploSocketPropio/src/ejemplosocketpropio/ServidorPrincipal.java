/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplosocketpropio;

/**
 *
 * @author Judi
 */
public class ServidorPrincipal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Servidor s = new Servidor(5000);
        Thread t = new Thread(s);
        t.start();
    }

}
