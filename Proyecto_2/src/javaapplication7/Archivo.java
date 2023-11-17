/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication7;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author ricardomazziotta
 */
public class Archivo {

    private static BufferedReader lector;
    private static String linea;
    private static String partes[] = null;
    
    public static java.io.File choose_archivo() {
//        String archivo = "";
        Scanner entrada = null;
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.showOpenDialog(fileChooser);
        try {
            String ruta = fileChooser.getSelectedFile().getAbsolutePath();                                        
            java.io.File f = new java.io.File(ruta);
            entrada = new Scanner(f);
//            while (entrada.hasNext()) {
//                archivo += entrada.nextLine() + "\n";
//            }
            return f;
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("No se ha seleccionado ningún fichero");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            if (entrada != null) {
                entrada.close();
            }
        }
        return null;
        }
    
    public static List leer_archivo(java.io.File f) throws FileNotFoundException, IOException {
        List Usuarios = new List();
        try{
            lector = new BufferedReader(new FileReader(f));
            while((linea = lector.readLine()) != null){
                partes = linea.split(",");
                String x = partes[0];
                String y = partes[1];
                Usuario user = new Usuario(x, y);
                Usuarios.insertar_al_final(user);
            }
        }catch (FileNotFoundException e){
            JOptionPane.showMessageDialog(null,e);
        }
        return Usuarios;
    }
    
    
}
