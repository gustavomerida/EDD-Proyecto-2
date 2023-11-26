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
//
//    public static void abrir_ventana(long time, List l){
//        Ventana_Principal v = new Ventana_Principal(time, l);
//        v.setSize(1020, 640);
//        v.setVisible(true);
//        v.setResizable(false);
//        v.setLocationRelativeTo(null);
//    }
//    
    public static void agregar_archivo(Ventana_Principal v, long tiempo){
        v.setVisible(false);
        Documento d = new Documento("n", "txt", 9);
        Ventana_nuevoDoc ventana_nuevoDoc = new Ventana_nuevoDoc(v, tiempo, d);
        ventana_nuevoDoc.setVisible(true);
        ventana_nuevoDoc.setSize(500, 350);
        ventana_nuevoDoc.getContentPane().setBackground(Color.WHITE);
    }
//    
//    public static List crear_colas (){
//        Heap cola_alta = new Heap();
//        Heap cola_media  = new Heap();
//        Heap cola_baja  = new Heap();
//        Heap cola_sin  = new Heap();
//        List Lista_impresion  = new List();
//        Lista_impresion.insertar_al_final(cola_alta);
//        Lista_impresion.insertar_al_final(cola_media);
//        Lista_impresion.insertar_al_final(cola_baja);
//        Lista_impresion.insertar_al_final(cola_sin);
//        return Lista_impresion;
//    }
//    
//    public static void añadir_hashtable(List L, Nodo<Documento> D, Nodo<Usuario> U){
//        L.insertar_al_final_doc(D.getElement(), U);
//    }
//    
//    public static Nodo<Usuario> comprobar_usuario (List HS, String D){
//        Nodo<Documento> Doc = HS.buscar_doc(D);
//        return Doc.getUser();
//    }
//    
//    public static Heap unir_colas(List LH){
//        Heap Cola_impresion = new Heap();
//        Nodo<Heap> h = LH.getFirst();
//        while (h != null){
//            while (h.getElement().isEmpty()) {
//                Documento x = h.getElement().getRoot();
//                Cola_impresion.insert(x);
//            }
//            h = h.getNext();
//        }
//        return Cola_impresion;
//    }
//    
//    public static void agregar_a_Cola_impresion (List HashTable, List ListHeap, List ListUsers, String User, String doc, boolean Prioritario){
//        Nodo<Usuario> U = ListUsers.buscar(User);
//        Nodo<Documento> D = U.getElement().getDocs().buscar_doc(doc);
//        D.getElement().setQueued(true);
//        Nodo<Heap> cola = ListHeap.getFirst();
//        if (Prioritario == true) {
//            D.getElement().setPrioritario(true);
//        if ("prioridad_alta".equals(U.getElement().getPrioridad())){
//            cola.getElement().insert(D.getElement());
//        }
//        else if("prioridad_media".equals(U.getElement().getPrioridad())){
//            cola = cola.getNext();
//            cola.getElement().insert(D.getElement());
//        }
//        else if("prioridad_baja".equals(U.getElement().getPrioridad())){
//            for (int i = 1; i <= 2; i++){
//                cola = cola.getNext();
//            }
//            cola.getElement().insert(D.getElement());
//        }
//        }
//        
//        else {
//            for (int i = 1; i <= 3; i++){
//                cola = cola.getNext();
//            }
//            cola.getElement().insert(D.getElement());
//        }
//        añadir_hashtable(HashTable, D, U);
//    }
//    
//    public static void eliminar_usuario(List HashTable, List ListUsers, List ListHeap, String User){
//        Nodo<Usuario> usuario = ListUsers.buscar(User);
//        Nodo<Documento> doc = HashTable.getFirst();
//        ListUsers.eliminar(usuario);
//        Nodo<Heap> cola = ListHeap.getFirst();
//        while (doc != null){
//            if (doc.getUser().getElement().getName().equals(User)){
//                if (doc.getElement().isPrioritario() == true){
//                    if ("prioridad_alta".equals(usuario.getElement().getPrioridad())){
//                        cola.getElement().Eliminar(doc.getElement().getNombre());
//                    }
//                    else if("prioridad_media".equals(usuario.getElement().getPrioridad())){
//                        cola = cola.getNext();
//                        cola.getElement().Eliminar(doc.getElement().getNombre());
//                    }
//                    else if("prioridad_baja".equals(usuario.getElement().getPrioridad())){
//                        for (int i = 1; i <= 2; i++){
//                            cola = cola.getNext();
//                        }
//                        cola.getElement().Eliminar(doc.getElement().getNombre());
//                    }
//                }
//                else {
//                    for (int i = 1; i <= 3; i++){
//                        cola = cola.getNext();
//                    }
//                    cola.getElement().Eliminar(doc.getElement().getNombre());
//                }
//            HashTable.eliminar(doc);    
//            }
//        }
//    }
    
    
            
    
    //Imagenes
    //<a target="_blank" href="https://icons8.com/icon/IerOpHeUt2OH/usuario-de-g%C3%A9nero-neutro">Usuario de género neutro</a> icono de <a target="_blank" href="https://icons8.com">Icons8</a>
    
}
