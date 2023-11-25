/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication7;

/**
 *
 * @author ricardomazziotta
 */
public class List <T> {
    private Nodo first; 
    private Nodo last; 
    private int size; 

    
    public List(){ 
            this.first = null; 
            this.last = null; 
            this.size = 0; 
    }
    
    /**
     * @return the first
     */
    public Nodo getFirst() {
        return first;
    }

    /**
     * @param first the first to set
     */
    public void setFirst(Nodo first) {
        this.first = first;
    }

    /**
     * @return the last
     */
    public Nodo getLast() {
        return last;
    }

    /**
     * @param last the last to set
     */
    public void setLast(Nodo last) {
        this.last = last;
    }

    /**
     * @return the size
     */
    public int getSize() {
        return size;
    }

    /**
     * @param size the size to set
     */
    public void setSize(int size) {
        this.size = size;
    }
    
    /**
     * Verifica si la lista está vacía.
     * @return true si la lista está vacía, false de lo contrario.
     */
    public boolean isEmpty(){
    return getFirst() == null; 
    }
    /**
     * Vacía la lista, eliminando todos los elementos.
     */
    public void empty(){            
        this.setFirst(null);            
        this.setLast(null);            
        this.setSize(0);
    }
    /**
     * Obtiene el primer nodo de la lista.
     * @return El primer nodo de la lista.
     */
    public Nodo first(){
        return this.getFirst();
    }
    /**
     * Obtiene el último nodo de la lista.
     * @return El último nodo de la lista.
     */
    public Nodo last(){
        return this.getLast();
    }
    /**
     * Inserta un elemento en la posición especificada.
     * @param x El elemento a insertar.
     * @param pValor El nodo después del cual se insertará el elemento.
     */
    
    public void insert(T x, Nodo pValor){
        Nodo newNodo = new Nodo(x);
        if (this.first()==this.last()){
            newNodo.setNext(first);
            this.first = newNodo;
            size++;
        }else{
            if(pValor!=this.last){
                newNodo.setNext(pValor.getNext());
                pValor.setNext(newNodo);
                size++;
            }
        }
    }
     /**
     * Agrega un elemento al final de la lista.
     * @param x El elemento a agregar.
     */
    public void insertar_al_final(T x){
        Nodo newNodo = new Nodo(x);
        if(this.isEmpty()){            
            first = last = newNodo;        }
        else{            
            last.setNext(newNodo);            
            last = newNodo;        
        }        
        size++;    
    }
    
//    public String read(Nodo <Usuario> pValor){
//        String x = pValor.getElement().getNombre();
//        return x;
//    }
//    
//    public void travel() {
//        Nodo<Usuario> pAux;
//        pAux = this.first();
//        while (pAux != this.last()) {
//            System.out.println(pAux.getElement().getNombre());
//            pAux.getElement().getRelaciones().travelr();
//            pAux = pAux.getNext();
//            }
//    }

////

    public void travelr() {
        Nodo<T> pAux;
        pAux = this.first();
        for (int i = 0; i < this.getSize(); i++) {
            System.out.println(pAux.getElement());
            pAux = pAux.getNext();
            }
        }
    
    public void eliminar(Nodo pValor){
        if (pValor != null){
            if (pValor.getPrev() != null){
                pValor.getPrev().setNext(pValor.getNext());
                if (pValor.getNext() != null) {
                    pValor.getNext().setPrev(pValor.getPrev());
                }
                else {
                    pValor.getPrev().setNext(null);
                        }     
                }
            else {
                if (pValor.getNext() != null) {
                    pValor.getNext().setPrev(null);
                }
                    }
        }
    }
    
    public Nodo buscar(String nombre) {
        Nodo<Usuario> pAux;
        pAux = this.first();
        while (pAux != null){
            String name = pAux.getElement().getName();
            if (name.equals(nombre)) {
                return pAux;
            }
            else {
                pAux = pAux.getNext();
            }
        }
        return null;
    }
    
    public String mostrar_usuarios(){
        // Recorrer la lista de usuarios y mostrar sus datos
        Nodo<Usuario> nodoUsuario = this.getFirst();
        String s = "";
        while (nodoUsuario != null) {
            Usuario usuario = nodoUsuario.getElement();
            s += "\n Usuario: " + usuario.getName() + "\n";
            Nodo <Documento> doc = usuario.getDocs().getFirst();
            while( doc!=null ) {
                s += "  Documento: " + doc.getElement().getNombre() + " (etiqueta de tiempo: " + doc.getElement().getTiempo() + ")\n";
                doc = doc.getNext();
            }
            nodoUsuario = nodoUsuario.getNext();
        }
        return s;
    }

    public void insertar_al_final_doc(Documento x, Nodo n){
        Nodo newNodo = new Nodo(x);
        if(this.isEmpty()){            
            first = last = newNodo;        }
        else{            
            last.setNext(newNodo);            
            last = newNodo;        
        }
        newNodo.setUser(n);
        size++;    
    }    
}
