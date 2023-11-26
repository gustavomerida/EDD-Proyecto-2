/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GUI;
//import java.awt;
import javaapplication7.*;
import javax.swing.*;
import Clases.*;
import java.io.IOException;
import java.lang.System.Logger;
import javax.swing.JOptionPane;
import EDD.*;
/**
 *
 * @author Gustavo
 */
public class Users_Content extends javax.swing.JPanel {
    long tiempo;
    String users;
    javaapplication7.List lista_usuarios;
    javaapplication7.List lista_docs;
    Heap heap;
    Ventana_Principal origen;
    /**
     * Creates new form Users_Content
     */
    public Users_Content(long t, String users, List lista_usuarios, List lista_docs, Heap heap) {
        initComponents();
    public Users_Content(long t, String users, List lista_usuarios, List lista_docs, Heap heap, Ventana_Principal origen) {
//        JTextArea areaUsuarios;
//        JButton botonMostrar;
//
@@ -52,6 +52,8 @@ public Users_Content(long t, String users, List lista_usuarios, List lista_docs,
        this.lista_usuarios = lista_usuarios;
        this.lista_docs = lista_docs;
        this.heap = heap;
        this.origen = origen;
        initComponents();
        initText(users);
    }

@@ -314,6 +316,7 @@ private void Area_UsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIR

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here: Agregar Usuario
        String nombre_usuario = JOptionPane.showInputDialog(null, "Ingrese el nombre del usuario a añadir");
    }                                        

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                         
@@ -345,15 +348,18 @@ private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here: Añadir Documento
//        Ventana_nuevoDoc add_doc = new Ventana_nuevoDoc();
//        add_doc.setVisible(true);
        String x = JOptionPane.showInputDialog(null, "Ingrese el nombre del usuario");
        String y = JOptionPane.showInputDialog(null, "Ingrese el nombre del documento");
        String z = JOptionPane.showInputDialog(null, "Ingrese el tipo del documento");
        Documento doc = new Documento(y, z, tiempo);
        Usuario u = (Usuario) lista_usuarios.buscar(x).getElement();
        lista_docs.insertar_al_final_doc(doc, lista_usuarios.buscar(x));
        u.agregar_doc(doc, lista_usuarios);
        Nodo<Usuario> u = lista_usuarios.buscar_usuario(x);
        if(u!=null){
            Usuario us = u.getElement();
            Ventana_nuevoDoc vn = new Ventana_nuevoDoc(origen, tiempo, u, lista_usuarios, lista_docs);
            vn.setVisible(true);

        }else{
            JOptionPane.showInternalMessageDialog(null, "No se encontró el usuario");
        }


    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        try {
            // TODO add your handling code here: Carga de archivo CSV
            this.lista_usuarios = Archivo.leer_archivo(Archivo.choose_archivo());
        } catch (IOException ex) {
        }
    }                                        
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea Area_Usuarios;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
