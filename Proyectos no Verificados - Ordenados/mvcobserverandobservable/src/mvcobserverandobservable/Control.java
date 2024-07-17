/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mvcobserverandobservable;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Judi
 */
 class Control implements ActionListener{
    Modelo modelo;

    public Control(Modelo modelo) {
        this.modelo = modelo;
    }
    @Override
    public void actionPerformed(ActionEvent e){
        modelo.sumar();
    }
}
