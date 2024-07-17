package Mail;

import Dominio.Configuración;
import Dominio.Cuenta;
import Dominio.Protocolo;
import Dominio.Servidor;
import Dominio.Mecanismo;
import Mensaje.MensajeCorreo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Observer;

public class Fachada implements IMail {

    private Fabrica fabrica;
    private Configuración configuración;

    public Fachada() {
        this.fabrica = new Fabrica();
        List<Servidor> lista = new ArrayList<>();
        this.configuración = new Configuración(lista);
        Observer observer = new Verificador();
        this.configuración.getObservable().addObserver(observer);
        List<Cuenta> cuentas = new ArrayList<>();
        cuentas.add(new Cuenta("servidorA12", "121SAS"));
        List<Protocolo> protocolos = new ArrayList<>();
        protocolos.add(new Protocolo("TCP", "Encargado de asegurar la entrega de datos"));
        protocolos.add(new Protocolo("UDP", "Encargado de asegurar la entrega de datos"));
        List<Mecanismo> mecanismos = new ArrayList<>();
        mecanismos.add(new Mecanismo("Enviador1", "Certeza y confianza con la entrega"));
        mecanismos.add(new Mecanismo("Enviador2", "Mayor velocidad a  la hora de entrega."));
        Servidor servidor = new Servidor(mecanismos, protocolos, cuentas);
        List<Servidor> oficial = new ArrayList<>();
        oficial.add(servidor);
        this.configuración.setListaServidores(oficial);
    }

    @Override
    public String recuperarConfiguración() {
        String lista = "";
        int size = this.configuración.recuperarConfiguracion().get(0).getListaMecanismos().size();
        for (int i = 0; i < size; i++) {
            if (i + 1 == size) {
                lista += this.configuración.recuperarConfiguracion().get(0).getListaMecanismos().get(i).getNombre();
            } else {
                lista += this.configuración.recuperarConfiguracion().get(0).getListaMecanismos().get(i).getNombre() + ",";
            }
        }
        return lista;
    }

    @Override
    public String enviarMensaje(MensajeCorreo mensajeCorreo, String tipo) {
        if (tipo.equalsIgnoreCase("Enviador1")) {
            return this.fabrica.crearInstancia(tipo).enviarMensaje(mensajeCorreo.getRemitente(), mensajeCorreo.getDestinatario(), mensajeCorreo.getAsunto(), mensajeCorreo.getCuerpo());
        } else if (tipo.equalsIgnoreCase("Enviador2")) {
            return this.fabrica.crearInstancia(tipo).enviarMensaje(mensajeCorreo.getRemitente(), mensajeCorreo.getDestinatario(), mensajeCorreo.getAsunto(), mensajeCorreo.getCuerpo());
        }
        return null;
    }

}
