/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mvcobserverandobservable;

import java.util.Observable;

/**
 *
 * @author Judi
 */
class Modelo extends Observable{
    int valor;
    public Modelo(){
    valor=0;
    }
    void sumar(){
    valor++;
    notifyObservers();
    }
    int obtenerValor(){
    return valor;
    }
}
