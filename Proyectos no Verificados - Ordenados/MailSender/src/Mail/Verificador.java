
package Mail;
import Dominio.Configuración;
import java.util.Observable;
import java.util.Observer;

public class Verificador implements Observer{
        @SuppressWarnings("unchecked")
    public void update(Observable observable, Object args) {
        if (args instanceof Configuración) {
            Configuración evento = (Configuración) args;
            System.out.printf("La configuracion ha sido editada");
            System.out.println(evento.toString());
        }
    }
}
