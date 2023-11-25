/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication7;

/**
 *
 * @author ricardomazziotta
 */
public class Usuario {
    private String name;
    private String prioridad;
    private List docs;
    
    public Usuario(String x, String y){
        this.name = x;
        this.prioridad = y;
        this.docs = new List();
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the prioridad
     */
    public String getPrioridad() {
        return prioridad;
    }

    /**
     * @param prioridad the prioridad to set
     */
    public void setPrioridad(String prioridad) {
        this.prioridad = prioridad;
    }

    /**
     * @return the docs
     */
    public List getDocs() {
        return docs;
    }

    /**
     * @param docs the docs to set
     */
    public void setDocs(List docs) {
        this.docs = docs;
    }

    public void agregar_doc(Documento doc, List l){
//        Documento doc = new Documento(name, type, t);        
        this.docs.insertar_al_final_doc(doc, l.buscar(this.name));
                
    }
}
