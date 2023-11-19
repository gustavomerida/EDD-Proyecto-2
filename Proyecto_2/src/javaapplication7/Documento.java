/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication7;

/**
 *
 * @author 
 */
public class Documento{
   private String nombre;
   private String tipo;
   private boolean queued;
   private long tiempo;
   
   public Documento(String x, String y, long t){
       this.nombre = x;
       this.tipo = y;
       this.queued = false;
       this.tiempo = t;
   }
   
    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }
   
    public int compareTo(Documento otro) {
        return Long.compare(this.getTiempo(), otro.getTiempo());
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

    /**
     * @return the tiempo
     */
    public long getTiempo() {
        return tiempo;
    }

    /**
     * @param tiempo the tiempo to set
     */
    public void setTiempo(long tiempo) {
        this.tiempo = tiempo;
    } 
}
