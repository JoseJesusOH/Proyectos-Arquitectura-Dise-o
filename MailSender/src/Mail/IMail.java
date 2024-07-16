
package Mail;

import Dominio.Configuración;
import Mensaje.MensajeCorreo;


public interface IMail {
    public String recuperarConfiguración();
    public String enviarMensaje(MensajeCorreo mensajeCorreo,String configuracion);
}
