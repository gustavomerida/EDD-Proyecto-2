/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;
import EDD.*;
import javaapplication7.*;
/**
 *
 * @author Gustavo
 */
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaUsuarios extends JFrame {
    private JTextArea areaUsuarios;
    private JButton botonMostrar;
    private List<Usuario> listaUsuarios;

    public VentanaUsuarios(List<Usuario> listaUsuarios) {
        super("Usuarios y documentos");

        // Guardar la lista de usuarios
        this.listaUsuarios = listaUsuarios;

        // Crear el área de texto y el botón
        areaUsuarios = new JTextArea();
        botonMostrar = new JButton("Mostrar usuarios");

        // Agregar el botón a un panel
        JPanel panelBoton = new JPanel();
        panelBoton.add(botonMostrar);

        // Agregar el área de texto y el panel de botón a la ventana
        getContentPane().add(areaUsuarios, BorderLayout.CENTER);
        getContentPane().add(panelBoton, BorderLayout.SOUTH);

        // Configurar la ventana
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        // Agregar el listener del botón
        botonMostrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrarUsuarios();
            }
        });
    }

    private void mostrarUsuarios() {
        // Limpiar el área de texto
        areaUsuarios.setText("");

        // Recorrer la lista de usuarios y mostrar sus datos
        Nodo<Usuario> nodoUsuario = listaUsuarios.getFirst();
        while (nodoUsuario != null) {
            Usuario usuario = nodoUsuario.getElement();
            areaUsuarios.append("Usuario: " + usuario.getName() + "\n");
            Nodo <Documento> doc = usuario.getDocs().getFirst();
            while( doc!=null ) {
                areaUsuarios.append("  Documento: " + doc.getElement().getNombre() + " (etiqueta de tiempo: " + doc.getElement().getTiempo() + ")\n");
                doc = doc.getNext();
            }
            nodoUsuario = nodoUsuario.getNext();
        }
    }
}
