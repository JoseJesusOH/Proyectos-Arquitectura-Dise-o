/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplosocketpropio;

import java.io.Serializable;

/**
 *
 * @author Judi
 */
public class Prueba implements Serializable{
    private String id;
    private String mensaje;

    public Prueba(String id, String mensaje) {
        this.id = id;
        this.mensaje = mensaje;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    @Override
    public String toString() {
        return "Prueba{" + "id=" + id + ", mensaje=" + mensaje + '}';
    }
    
}
