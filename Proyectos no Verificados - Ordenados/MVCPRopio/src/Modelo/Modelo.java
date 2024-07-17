/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.Observable;

/**
 *
 * @author Judi
 */
public class Modelo extends Observable {

    int valor;

    public Modelo() {
        valor = 0;
    }

    public void sumar() {
        valor++;
        setChanged();
        notifyObservers();
    }

    public int obtenerValor() {
        return valor;
    }
}
