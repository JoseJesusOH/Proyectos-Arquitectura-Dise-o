/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

import Modelo.Modelo;
import Vista.Vista;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Judi
 */
public class Control {

    Modelo modelo;

    public Control(Modelo modelo) {
        this.modelo = modelo;
    }

    public void sumar() {
        modelo.sumar();
    }
}
