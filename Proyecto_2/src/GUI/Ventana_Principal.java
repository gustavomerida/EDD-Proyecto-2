/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;
import Clases.*;
import EDD.*;
import java.awt.Color;
import javax.swing.JOptionPane;
import java.awt.BorderLayout;
import javaapplication7.*;
import javax.swing.JPanel;

/**
 *
 * @author Gustavo
 */
public class Ventana_Principal extends javax.swing.JFrame {
    long tiempo;
    List users;
    /**
     * Creates new form Ventana_Principal
     */
    public Ventana_Principal(long t, List l) {
        super("Simulacion de impresión");
        this.getContentPane().setBackground(Color.WHITE);
        this.tiempo = t;
        this.users = l;
        initComponents();
        initContent();
//        this.setLocationRelativeTo(null);
        
    }

    public Ventana_Principal() {
        initComponents();
        initContent();
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(Color.WHITE);
    }

    public void initContent(){
//        P_Content pl = new P_Content();
        ShowPanel(new P_Content());
    }
    
    private void ShowPanel(JPanel p){
        p.setSize(750,430);
        p.setLocation(0,0);
        
        Content.removeAll();
        Content.add(p, BorderLayout.CENTER);
        Content.revalidate();
        Content.repaint();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Background = new javax.swing.JPanel();
        Menu = new javax.swing.JPanel();
        BotonUsers = new javax.swing.JButton();
        BotonHome = new javax.swing.JButton();
        BotonCola = new javax.swing.JButton();
        TituloMenu = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        BotonTodo = new javax.swing.JButton();
        Head = new javax.swing.JPanel();
        Titulo = new javax.swing.JLabel();
        BotonTiempo = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        Content = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Background.setBackground(new java.awt.Color(255, 255, 255));

        Menu.setBackground(new java.awt.Color(102, 102, 102));
        Menu.setPreferredSize(new java.awt.Dimension(250, 640));

        BotonUsers.setBackground(new java.awt.Color(153, 153, 153));
        BotonUsers.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BotonUsers.setForeground(new java.awt.Color(255, 255, 255));
        BotonUsers.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8-usuarios-25.png"))); // NOI18N
        BotonUsers.setText("Gestión de usuarios y documentos");
        BotonUsers.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(0, 0, 0)));
        BotonUsers.setBorderPainted(false);
        BotonUsers.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonUsers.setHideActionText(true);
        BotonUsers.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        BotonUsers.setIconTextGap(10);
        BotonUsers.setPreferredSize(new java.awt.Dimension(239, 27));
        BotonUsers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonUsersActionPerformed(evt);
            }
        });

        BotonHome.setBackground(new java.awt.Color(153, 153, 153));
        BotonHome.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BotonHome.setForeground(new java.awt.Color(255, 255, 255));
        BotonHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8-página-principal-30.png"))); // NOI18N
        BotonHome.setText("Principal");
        BotonHome.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(0, 0, 0)));
        BotonHome.setBorderPainted(false);
        BotonHome.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonHome.setHideActionText(true);
        BotonHome.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        BotonHome.setIconTextGap(10);
        BotonHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonHomeActionPerformed(evt);
            }
        });

        BotonCola.setBackground(new java.awt.Color(153, 153, 153));
        BotonCola.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BotonCola.setForeground(new java.awt.Color(255, 255, 255));
        BotonCola.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8-proceso-25.png"))); // NOI18N
        BotonCola.setText("Cola de impresión");
        BotonCola.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(0, 0, 0)));
        BotonCola.setBorderPainted(false);
        BotonCola.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonCola.setHideActionText(true);
        BotonCola.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        BotonCola.setIconTextGap(10);
        BotonCola.setPreferredSize(new java.awt.Dimension(145, 50));
        BotonCola.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonColaActionPerformed(evt);
            }
        });

        TituloMenu.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        TituloMenu.setForeground(new java.awt.Color(255, 255, 255));
        TituloMenu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TituloMenu.setText("Menú de opciones");

        BotonTodo.setBackground(new java.awt.Color(153, 153, 153));
        BotonTodo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BotonTodo.setForeground(new java.awt.Color(255, 255, 255));
        BotonTodo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8-flowchart-of-an-organisation-viewed-on-computer-monitor-24.png"))); // NOI18N
        BotonTodo.setText("Ver todo");
        BotonTodo.setActionCommand("Ver todo");
        BotonTodo.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(0, 0, 0)));
        BotonTodo.setBorderPainted(false);
        BotonTodo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonTodo.setHideActionText(true);
        BotonTodo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        BotonTodo.setIconTextGap(10);
        BotonTodo.setPreferredSize(new java.awt.Dimension(145, 50));
        BotonTodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonTodoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout MenuLayout = new javax.swing.GroupLayout(Menu);
        Menu.setLayout(MenuLayout);
        MenuLayout.setHorizontalGroup(
            MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(TituloMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(MenuLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(MenuLayout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(BotonHome, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(MenuLayout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(BotonUsers, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(BotonTodo, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(MenuLayout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(BotonCola, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        MenuLayout.setVerticalGroup(
            MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuLayout.createSequentialGroup()
                .addGap(119, 119, 119)
                .addComponent(TituloMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(BotonHome, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(BotonUsers, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(BotonTodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(BotonCola, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        Head.setBackground(new java.awt.Color(153, 153, 153));
        Head.setPreferredSize(new java.awt.Dimension(750, 150));

        Titulo.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        Titulo.setForeground(new java.awt.Color(255, 255, 255));
        Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo.setText("SISTEMA DE IMPRESIÓN");

        BotonTiempo.setText("Mostrar tiempo");
        BotonTiempo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonTiempoActionPerformed(evt);
            }
        });

        jButton1.setText("Agg arvhivo");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout HeadLayout = new javax.swing.GroupLayout(Head);
        Head.setLayout(HeadLayout);
        HeadLayout.setHorizontalGroup(
            HeadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HeadLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(HeadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BotonTiempo)
                    .addGroup(HeadLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jButton1)))
                .addGap(88, 88, 88)
                .addComponent(Titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(202, 202, 202))
        );
        HeadLayout.setVerticalGroup(
            HeadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HeadLayout.createSequentialGroup()
                .addContainerGap(58, Short.MAX_VALUE)
                .addGroup(HeadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(HeadLayout.createSequentialGroup()
                        .addComponent(BotonTiempo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1))
                    .addComponent(Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34))
        );

        Content.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout ContentLayout = new javax.swing.GroupLayout(Content);
        Content.setLayout(ContentLayout);
        ContentLayout.setHorizontalGroup(
            ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 758, Short.MAX_VALUE)
        );
        ContentLayout.setVerticalGroup(
            ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 478, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout BackgroundLayout = new javax.swing.GroupLayout(Background);
        Background.setLayout(BackgroundLayout);
        BackgroundLayout.setHorizontalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addComponent(Menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Head, javax.swing.GroupLayout.DEFAULT_SIZE, 770, Short.MAX_VALUE)
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Content, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        BackgroundLayout.setVerticalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addComponent(Head, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Content, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BotonUsersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonUsersActionPerformed
        // TODO add your handling code here:
        ShowPanel(new Users_Content(tiempo, users.mostrar_usuarios()));
        
    }//GEN-LAST:event_BotonUsersActionPerformed

    private void BotonHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonHomeActionPerformed
        // TODO add your handling code here:
        //HHHHH
        ShowPanel(new P_Content());
        
    }//GEN-LAST:event_BotonHomeActionPerformed

    private void BotonColaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonColaActionPerformed
        // TODO add your handling code here:
        ShowPanel(new Cola_Content());
    }//GEN-LAST:event_BotonColaActionPerformed

    private void BotonTiempoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonTiempoActionPerformed
        // TODO add your handling code here:
        Funciones.obtenerTiempo(tiempo);

    }//GEN-LAST:event_BotonTiempoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Funciones.agregar_archivo(this, this.tiempo);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void BotonTodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonTodoActionPerformed
        // TODO add your handling code here:
        Ventana_Todo vt = new Ventana_Todo();
        vt.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BotonTodoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Ventana_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana_Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JButton BotonCola;
    private javax.swing.JButton BotonHome;
    private javax.swing.JButton BotonTiempo;
    private javax.swing.JButton BotonTodo;
    private javax.swing.JButton BotonUsers;
    private javax.swing.JPanel Content;
    private javax.swing.JPanel Head;
    private javax.swing.JPanel Menu;
    private javax.swing.JLabel Titulo;
    private javax.swing.JLabel TituloMenu;
    private javax.swing.JButton jButton1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
