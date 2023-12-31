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
//<<<<<<< HEAD
////    JTextArea Area_Usuarios;
//=======
    String registro;
//>>>>>>> 3ae4378e5dee35b338bd72c78294690883b800b6
    /**
     * Creates new form Users_Content
     */
    public Users_Content(long t, String users, List lista_usuarios, List lista_docs, Heap heap, Ventana_Principal origen, String registro) {
//        JTextArea areaUsuarios;
//        JButton botonMostrar;
//
//        // Crear el área de texto y el botón
//        areaUsuarios = new JTextArea();
//        areaUsuarios.setPreferredSize(new Dimension(200, 200));
//        botonMostrar = new JButton("Mostrar usuarios");
//        JScrollPane scrollPane = new JScrollPane(areaUsuarios);
//        this.add(botonMostrar);
//        this.add(scrollPane);
//        
//        // Agregar el listener del botón
//        botonMostrar.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                mostrarUsuarios(areaUsuarios);
//            }
//        });
        
        this.tiempo = t;
        this.users = users;
        this.lista_usuarios = lista_usuarios;
        this.lista_docs = lista_docs;
        this.heap = heap;
        this.origen = origen;
        this.registro = registro;
//        this.registros = registros;
        initComponents();
        initText(users);
    }
    
    public void initText(String users){
        Area_Usuarios.setText(users);
    }
        

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Area_Usuarios = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        Area_Usuarios.setEditable(false);
        Area_Usuarios.setColumns(20);
        Area_Usuarios.setRows(5);
        Area_Usuarios.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                Area_UsuariosComponentAdded(evt);
            }
        });
        Area_Usuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Area_UsuariosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Area_Usuarios);

        jButton1.setText("Cargar Usuarios");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Añadir usuarios");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Carga los usuarios desde un");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Añade usuarios manualmente");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Elimina usuarios");

        jButton3.setText("Eliminar usuarios");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Añade documentos de un");

        jButton4.setText("Añadir documentos");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Enviar a la cola");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Envia documentos a la cola");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("archivo .CSV");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("usuario");

        jSeparator1.setBackground(new java.awt.Color(153, 153, 153));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("de impresión");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("Elimina documentos de un");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setText("usuario");

        jButton6.setText("Eliminar documento");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton5)
                                    .addComponent(jButton6)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel1))
                                .addGap(18, 18, 18)
                                .addComponent(jButton1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(jButton3))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(jButton4))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(jLabel6))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(jButton1)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jButton2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jButton3))
                        .addGap(30, 30, 30)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jButton5))
                        .addGap(5, 5, 5)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jButton6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void Area_UsuariosComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_Area_UsuariosComponentAdded
        
        
    }//GEN-LAST:event_Area_UsuariosComponentAdded

    private void Area_UsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Area_UsuariosMouseClicked
        // TODO add your handling code here:
        // TODO add your handling code here:
//        Area_Usuarios.setText("");
//
//        // Recorrer la lista de usuarios y mostrar sus datos
//        Nodo<Usuario> nodoUsuario = users.getFirst();
//        while (nodoUsuario != null) {
//            Usuario usuario = nodoUsuario.getElement();
//            Area_Usuarios.append("Usuario: " + usuario.getName() + "\n");
//            Nodo <Documento> doc = usuario.getDocs().getFirst();
//            while( doc!=null ) {
//                Area_Usuarios.append("  Documento: " + doc.getElement().getNombre() + " (etiqueta de tiempo: " + doc.getElement().getTiempo() + ")\n");
//                doc = doc.getNext();
//            }
//            nodoUsuario = nodoUsuario.getNext();
//        }
        
    }//GEN-LAST:event_Area_UsuariosMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here: Agregar Usuario
        String nombre_usuario = JOptionPane.showInputDialog(null, "Ingrese el nombre del usuario a añadir");
        String prioridad = JOptionPane.showInputDialog(null, "Indique la prioridad del usuario a añadir");
        Usuario.añadir_usuario(lista_usuarios, prioridad, nombre_usuario);
        Users_Content actual = new Users_Content(tiempo, lista_usuarios.mostrar_usuarios(), lista_usuarios, lista_docs, heap, origen, registro);
        origen.ShowPanel(actual);
    }                                        

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here: Eliminar Usuario
        String x = JOptionPane.showInputDialog(null, "Ingrese el nombre del usuario a eliminar");
        lista_usuarios.eliminar(lista_usuarios.buscar(x));
    }                                        

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        String x = JOptionPane.showInputDialog(null, "Ingrese el nombre documento que desee enviar a la cola de impresion");
//<<<<<<< HEAD
        Nodo<Documento> documento = lista_docs.buscar_doc(x);
        if (documento!=null){
            Documento d = documento.getElement();
            if(d.isQueued()){
                JOptionPane.showInternalMessageDialog(null, "El documento ya está en la cola.");
            }else{
                Ventana_imprimir imp = new Ventana_imprimir(tiempo, lista_usuarios, lista_docs, d, heap, origen, registro);
                imp.setVisible(true);
                registro = "Se ha añadido " + d.getNombre() + d.getTipo() + " a la cola\n";//Nuevo 
                origen.registro += registro;
            }
        }else{
            JOptionPane.showInternalMessageDialog(null, "No se encontró el documento");
        }
        
//=======
//        Documento d = (Documento) lista_docs.buscar_doc(x).getElement();
//        Ventana_imprimir imp = new Ventana_imprimir(d, heap);
//        imp.setVisible(true);
//        registro = registro + "Se ha añadido " + d.getNombre() + " A la cola\n";//Nuevo        
//>>>>>>> 3ae4378e5dee35b338bd72c78294690883b800b6
    }//GEN-LAST:event_jButton5ActionPerformed


    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here: Eliminar Documento
        String x = JOptionPane.showInputDialog(null, "Ingrese el nombre del documento que desee eliminar");
//        String y = JOptionPane.showInputDialog(null, "Ingrese el nombre del documento que desee eliminar");
//        Usuario u = (Usuario) lista_usuarios.buscar(x).getElement();
//        u.getDocs().eliminar(u.getDocs().buscar(y));
        Usuario u = (Usuario) lista_docs.buscar_doc(x).getUser().getElement();
        u.getDocs().eliminar(lista_docs.buscar_doc(x));
        lista_docs.eliminar(lista_docs.buscar_doc(x));
    }                                        

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here: Añadir Documento
        String x = JOptionPane.showInputDialog(null, "Ingrese el nombre del usuario");
        Nodo<Usuario> u = lista_usuarios.buscar_usuario(x);
        if(u!=null){
            Usuario us = u.getElement();
            Ventana_nuevoDoc vn = new Ventana_nuevoDoc(origen, tiempo, u, lista_usuarios, lista_docs, heap, registro);
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
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
