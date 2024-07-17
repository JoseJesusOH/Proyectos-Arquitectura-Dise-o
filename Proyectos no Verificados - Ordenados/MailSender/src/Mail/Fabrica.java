package Mail;

import java.util.ArrayList;
import java.util.List;

public class Fabrica {

    private List<String> mecanismos=new ArrayList<>();
    private String enviador1 = "Enviador1";
    private String enviador2 = "Enviador2";

    public Fabrica() {
        this.mecanismos.add(enviador1);
        this.mecanismos.add(enviador2);
    }
    public IMecanismo crearInstancia(String mecanismo){
        if(mecanismo.equalsIgnoreCase(enviador1)){
            Enviador1 enviador1=new Enviador1();
            return enviador1;
        }else  if(mecanismo.equalsIgnoreCase(enviador2)){
            Enviador2 enviador2=new Enviador2();
            return enviador2;
        }
        else{
            System.out.println("Mecanismo Invalido");
            return null;
        }
    }

}
