/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import GUI.*;
import java.awt.Color;
import javax.swing.JOptionPane;
import EDD.*;
import javaapplication7.*;

/**
 *
 * @author Gustavo
 */
public class Funciones {
    public static long obtenerTiempo(long tiempo){
        long elapsedTime = System.nanoTime() - tiempo;
        double elapsedSeconds = (double) elapsedTime / 1_000_000_000.0;
        JOptionPane.showMessageDialog(null,"El tiempo que ha pasado es: " + (long) elapsedSeconds);
        return (long) elapsedSeconds;   
    }

    public static void abrir_ventana(long time){
        Ventana_Principal v = new Ventana_Principal(time);
        v.setSize(1020, 640);
        v.setVisible(true);
        v.setResizable(false);
        v.setLocationRelativeTo(null);
    }
    
    public static void agregar_archivo(Ventana_Principal v, long tiempo){
        v.setVisible(false);
        Documento d = new Documento("n", "txt", 9);
        Ventana_nuevoDoc ventana_nuevoDoc = new Ventana_nuevoDoc(v, tiempo, d);
        ventana_nuevoDoc.setVisible(true);
        ventana_nuevoDoc.setSize(500, 350);
        ventana_nuevoDoc.getContentPane().setBackground(Color.WHITE);
    }
    
    
    //Imagenes
    //<a target="_blank" href="https://icons8.com/icon/IerOpHeUt2OH/usuario-de-g%C3%A9nero-neutro">Usuario de género neutro</a> icono de <a target="_blank" href="https://icons8.com">Icons8</a>
    
}
