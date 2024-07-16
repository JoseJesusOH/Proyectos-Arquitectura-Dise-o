
package Dominio;

public class Protocolo {
   private String nombre;
   private String desccripción;

    public Protocolo() {
    }

    public Protocolo(String nombre, String desccripción) {
        this.nombre = nombre;
        this.desccripción = desccripción;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDesccripción() {
        return desccripción;
    }

    public void setDesccripción(String desccripción) {
        this.desccripción = desccripción;
    }

    @Override
    public String toString() {
        return "Protocolo{" + "nombre=" + nombre + ", desccripci\u00f3n=" + desccripción + '}';
    }
   
}
