/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Proyecto_2;
//import Clases.*;
import EDD.*;
import GUI.*;
import javaapplication7.*;

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
        long startTime = System.nanoTime();
        Heap ColaPrioridad = new Heap();
//        Documento doc = new Documento("No se", "pdf", 2);
//        Documento doc2 = new Documento("No se2", "pdf", 15);
//        Documento doc3 = new Documento("No se3", "pdf", 6);
//
//        Heap Cola = new Heap();
//        Cola.insert(doc);
//        Cola.insert(doc2);
//        Cola.insert(doc3);
//        Cola.show();
//        System.out.println("");
//        System.out.println("Se eliminó el documento " + Cola.getRoot().getNombre());
//        Cola.show();
        
//        Funciones.abrir_ventana(startTime);
        
        List<Usuario> listaUsuarios = new List<>();
        Usuario juan = new Usuario("Juan", "prioridad_alta");
        Nodo nodojuan = listaUsuarios.buscar_usuario("Juan");
        Documento doc1 = new Documento("Factura", ".pdf", 100);
        juan.getDocs().insertar_al_final_doc(doc1, nodojuan);
        Documento doc2 = new Documento("Recibo", ".pdf", 50);
        juan.getDocs().insertar_al_final(doc2);

        listaUsuarios.insertar_al_final(juan);
        
        Usuario maria = new Usuario("Maria", "prioridad_baja");
        Documento doc3 = new Documento("Contrato", ".pdf", 200);
        maria.getDocs().insertar_al_final(doc3);
        listaUsuarios.insertar_al_final(maria);
        
        List<Documento> lista_docs = new List();
        lista_docs.insertar_al_final_doc(doc3, nodojuan);
        lista_docs.insertar_al_final_doc(doc2, nodojuan);
        lista_docs.insertar_al_final_doc(doc1, nodojuan);
        
        Funciones.abrir_ventana(startTime, listaUsuarios, lista_docs, ColaPrioridad, "");
    }
    
}
