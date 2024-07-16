package Mail;

public class Enviador2 implements IMecanismo {

    @Override
    public String enviarMensaje(String remitente, String destinatario, String asunto, String cuerpo) {
        StringBuilder logger = new StringBuilder();
        logger.append("Mensaje enviado a; ").append(destinatario);
        logger.append("De parte de; ").append(remitente);
        logger.append("Asunto; ").append(asunto);
        logger.append("Mensaje Enviado exitosamente");
        return logger.toString();
    }

}
