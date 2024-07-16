package Dominio;

import java.util.List;
import java.util.Observable;

public class Configuración {

    private List<Servidor> listaServidores;

    public Configuración(List<Servidor> listaServidores) {
        this.listaServidores = listaServidores;
    }

    public void setListaServidores(List<Servidor> listaServidores) {
        this.listaServidores = listaServidores;
        Configuración event=new Configuración(this.listaServidores);
        synchronized (OBSERVABLE) {
            OBSERVABLE.setChanged();
            OBSERVABLE.notifyObservers(event);            
        }
         
         
    }

    public List<Servidor> recuperarConfiguracion() {
        return listaServidores;
    }
   private static final ConfiguraciónObservable OBSERVABLE;


    static {
        OBSERVABLE = new ConfiguraciónObservable();
    }

    public static Observable getObservable() {
        return OBSERVABLE;
    }

    
    private static class ConfiguraciónObservable extends Observable {
        @Override
        public synchronized void setChanged() {
            super.setChanged();
        }
    }
}
