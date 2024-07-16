
package Mail;

import java.util.GregorianCalendar;
import java.util.Locale;

public class Enviador1 implements IMecanismo{

   @Override
    public String enviarMensaje(String remitente, String destinatario, String asunto, String cuerpo) {
        StringBuilder logger = new StringBuilder();
        logger.append("Mensaje enviado a; ").append(destinatario);
        logger.append("De parte de; ").append(remitente);
        logger.append("Mensaje Enviado exitosamente  a las; ").append(GregorianCalendar.getInstance().HOUR_OF_DAY);
        return logger.toString();
    }
}
