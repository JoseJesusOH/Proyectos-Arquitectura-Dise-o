package Dominio;

import java.util.ArrayList;
import java.util.List;

public class Servidor {

    private List<Mecanismo> listaMecanismos;
    private List<Protocolo> listaProtocolos;
    private List<Cuenta> listaCuentas;

    public Servidor() {
    }

    public Servidor(List<Mecanismo> listaMecanismos, List<Protocolo> listaProtocolos, List<Cuenta> listaCuentas) {
        this.listaMecanismos = listaMecanismos;
        this.listaProtocolos = listaProtocolos;
        this.listaCuentas = listaCuentas;
    }

    public List<Mecanismo> getListaMecanismos() {
        return listaMecanismos;
    }

    public void setListaMecanismos(List<Mecanismo> listaMecanismos) {
        this.listaMecanismos = listaMecanismos;
    }

    public List<Protocolo> getListaProtocolos() {
        return listaProtocolos;
    }

    public void setListaProtocolos(List<Protocolo> listaProtocolos) {
        this.listaProtocolos = listaProtocolos;
    }

    public List<Cuenta> getListaCuentas() {
        return listaCuentas;
    }

    public void setListaCuentas(List<Cuenta> listaCuentas) {
        this.listaCuentas = listaCuentas;
    }

    @Override
    public String toString() {
        return "Servidor{" + "listaMecanismos=" + listaMecanismos + ", listaProtocolos=" + listaProtocolos + ", listaCuentas=" + listaCuentas + '}';
    }

 

}
