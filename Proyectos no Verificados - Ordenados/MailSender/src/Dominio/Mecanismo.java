package Dominio;

public class Mecanismo {

    private String nombre;
    private String descripcion;

    public Mecanismo() {
    }

    public Mecanismo(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Mecanismo{" + "nombre=" + nombre + ", descripcion=" + descripcion + '}';
    }

}
