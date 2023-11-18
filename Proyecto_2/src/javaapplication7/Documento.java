/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication7;

/**
 *
 * @author 
 */
public class Documento {
   private String nombre;
   private String tipo;
   private boolean queued;
   
   public Documento(String x, String y){
       this.nombre = x;
       this.tipo = y;
       this.queued = false;
   }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the queue
     */
    public boolean isQueued() {
        return queued;
    }

    /**
     * @param queue the queue to set
     */
    public void setQueued(boolean queue) {
        this.queued = queue;
    }
}
