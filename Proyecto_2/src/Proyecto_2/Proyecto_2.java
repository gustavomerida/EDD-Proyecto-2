/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Proyecto_2;
import EDD.*;

/**
 *
 * @author Gustavo
 */
public class Proyecto_2 {

    /**
     * @param args the command line arguments 
     */
    public static void main(String[] args) {
        // TODO code application logic here
        minHeap ColaPrioridad = new minHeap();
        ColaPrioridad.insert(2);
        ColaPrioridad.insert(4);
        ColaPrioridad.insert(6);
        ColaPrioridad.insert(8);
        ColaPrioridad.insert(10);
        
        ColaPrioridad.sort();
        
        Comparable elim = ColaPrioridad.getRoot();
        
        elim.toString();
        
        System.out.println("\nSe elimino el elemento " + elim + "\n");
        
        ColaPrioridad.sort();
        
    }
    
}
