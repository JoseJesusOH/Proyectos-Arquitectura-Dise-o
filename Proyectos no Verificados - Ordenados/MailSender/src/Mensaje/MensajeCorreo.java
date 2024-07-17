
package Mensaje;


public class MensajeCorreo {
    private String remitente;
    private String destinatario;
    private String asunto; 
    private String cuerpo;

    public MensajeCorreo() {
    }

    public MensajeCorreo(String remitente, String destinatario, String asunto, String cuerpo) {
        this.remitente = remitente;
        this.destinatario = destinatario;
        this.asunto = asunto;
        this.cuerpo = cuerpo;
    }

    public String getRemitente() {
        return remitente;
    }

    public void setRemitente(String remitente) {
        this.remitente = remitente;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    public String getAsunto() {
        return asunto;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    public String getCuerpo() {
        return cuerpo;
    }

    public void setCuerpo(String cuerpo) {
        this.cuerpo = cuerpo;
    }

    @Override
    public String toString() {
        return "MensajeCorreo{" + "remitente=" + remitente + ", destinatario=" + destinatario + ", asunto=" + asunto + ", cuerpo=" + cuerpo + '}';
    }
    
}
