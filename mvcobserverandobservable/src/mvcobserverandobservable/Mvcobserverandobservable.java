/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mvcobserverandobservable;

/**
 *
 * @author Judi
 */
public class Mvcobserverandobservable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Modelo modelo =new Modelo();
        Vista vista=new Vista(modelo);
        modelo.addObserver(vista);
    }
    
};
