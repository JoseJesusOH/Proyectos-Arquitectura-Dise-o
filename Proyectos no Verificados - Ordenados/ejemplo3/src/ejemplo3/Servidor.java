/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplo3;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;
 
/**
 * Clase Servidor que iniciará la escucha por un
 * puerto y recibirá los mensajes de los clientes.
 * Se extenderá a Thread para permitir programación concurrente
 * De forma que el servidor permita la conexión de múltiples clientes
 */
public class Servidor extends Thread {
    private int puerto; // Número de puerto de escucha para la conexión de clientes
    private DataInputStream canalEntradaDatos; //Canal de entrada de datos de clientes
 
    /**
     * Constructor
     * @param puerto: Número de puerto de escucha para la conexión de clientes por Socket
     */
    public Servidor(int puerto) {
        this.puerto = puerto;
    }
 
    //Sobreescribimos método run para que el servidor se inicie y permita
    //conexiones de múltiples clientes (un hilo por cada cliente)
    @Override
    public void run() {
        try {
            //Creamos instancia de ServerSocket para
            //atender peticiones de clientes por el puerto indicado
            ServerSocket socketServidor = new ServerSocket(this.puerto);
            System.out.println(FechaActual() + " Servidor esperando " +
                    "peticiones de clientes por puerto " + puerto + "...");
            //Dejaremos el servidor siempre escuchando
            //Hasta que se reciba el mensaje: [[fin]]
            String mensajeCliente = "";
            while(!mensajeCliente.equalsIgnoreCase("[[fin]]")) {
                // Esperamos a que se conecte un cliente y aceptamos la conexión
                Socket socketCliente = socketServidor.accept();
                System.out.println(FechaActual() +
                        " Cliente conectado: " + socketCliente.getInetAddress());
                //Estableceremos canal de comunicación con cliente
                canalEntradaDatos = new DataInputStream(socketCliente.getInputStream());
                //Leemos mensaje del cliente
                mensajeCliente = canalEntradaDatos.readUTF();
                //Lo mostramos por consola
                System.out.println(FechaActual() + " [Mensaje recibido]");
                System.out.println(FechaActual() +
                        " * Cliente: " + socketCliente.getInetAddress());
                System.out.println(FechaActual() +
                        " * Mensaje: " + mensajeCliente);
            }
        } catch (IOException e) {
            System.out.println(FechaActual() + " Error al abrir puerto " + puerto +
                    " para escucha de servidor: " + e.getMessage());
            System.exit(2); //Cerramos aplicación con código de salida 2
        }
    }
 
    /**
     * Función que devuelve la fecha y hora actuales con formato año-mes-dia hora:minuto:segundo:milisegundo
     */
    public String FechaActual()
    {
        Date fechaHoraActual = new Date();
        String fechaFormateada =
                new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").format(fechaHoraActual);
        return fechaFormateada;
    }
}
