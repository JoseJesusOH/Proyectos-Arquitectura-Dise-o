/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

import Control.Control;
import Modelo.Modelo;
import Vista.Vista;

/**
 *
 * @author Judi
 */
public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        Modelo modelo = new Modelo();
        Control control = new Control(modelo);
        Vista vista1 = new Vista(control);
                Vista vista3 = new Vista(control);
        Vista vista2 = new Vista(control);

        modelo.addObserver(vista1);
                modelo.addObserver(vista2);
        modelo.addObserver(vista3);
        vista1.setVisible(true);
        vista2.setVisible(true);
        vista3.setVisible(true);

    }

}
