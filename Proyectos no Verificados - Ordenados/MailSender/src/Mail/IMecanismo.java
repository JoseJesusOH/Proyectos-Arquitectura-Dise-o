
package Mail;

public interface IMecanismo {
    public String enviarMensaje(String remitente, String destinatario, String asunto, String cuerpo);
}
