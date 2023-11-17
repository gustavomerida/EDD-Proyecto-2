/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication7;

/**
 *
 * @author ricardomazziotta
 */
public class Nodo<T> {
    private Nodo<T>  next;
    private Nodo<T>  prev;
    private T element;
    
    public Nodo(T element) {
        this.next = null;
        this.prev = null;
        this.element = element;
    }    

    /**
     * @return the next
     */
    public Nodo<T> getNext() {
        return next;
    }

    /**
     * @param next the next to set
     */
    public void setNext(Nodo<T> next) {
        this.next = next;
    }

    /**
     * @return the prev
     */
    public Nodo<T> getPrev() {
        return prev;
    }

    /**
     * @param prev the prev to set
     */
    public void setPrev(Nodo<T> prev) {
        this.prev = prev;
    }

    /**
     * @return the element
     */
    public T getElement() {
        return element;
    }

    /**
     * @param element the element to set
     */
    public void setElement(T element) {
        this.element = element;
    }
}
