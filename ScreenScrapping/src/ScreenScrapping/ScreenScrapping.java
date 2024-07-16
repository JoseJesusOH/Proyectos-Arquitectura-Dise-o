/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ScreenScrapping;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;



/**
 *
 * @author Judi
 */
public class ScreenScrapping {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, AWTException, InterruptedException {
        // TODO code application logic here
//       Document d= Jsoup.connect("https://www.banxico.org.mx/SieInternet/consultarDirectorioInternetAction.do?sector=6&accion=consultarCuadroAnalitico&idCuadro=CA18&locale=es").get();
     
       Robot r =new Robot();
//       System.out.print( d.html()); 
Runtime.getRuntime().exec("notepad");
Thread.sleep(2000);
r.keyPress(KeyEvent.VK_H);
    Thread.sleep(500);
    r.keyPress(KeyEvent.VK_O);
    Thread.sleep(500);
    r.keyPress(KeyEvent.VK_L);
    Thread.sleep(500);
    r.keyPress(KeyEvent.VK_A);
    Thread.sleep(500);

    }
    
}
