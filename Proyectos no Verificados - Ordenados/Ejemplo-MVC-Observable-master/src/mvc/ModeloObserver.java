package mvc;

/**
 * Interfaz Observador. Contendrá los metodos de tipo ModeloObserver para que el observador se actualice según lo que reciba del modelo.
 */
public interface ModeloObserver {
    
    /**
     * Metodo valorCambiado. Unico metodo de la interfaz pues solo nos interesa como observadores el valor "valor" para modificar nuestra vista.
     * 
     * @param valor : Notificación del nuevo valor que nos llega del modelo. El modelo notificará con este metodo a cada observador, el nuevo valor de la logica.
     */
    public void valorCambiado(int valor);

}
