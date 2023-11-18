/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package EDD;

/**
 *
 * @author Gustavo
 * @param <T>
 */

public abstract class Heap<T extends Comparable<T>> implements IHeap<T>{
    protected T[] heap;
    protected int position = -1;
    
    public Heap(){
        heap = (T[]) new Comparable[10]; //Porque es un arreglo que que puede crecer
    }
    
    private boolean isFull(){
        return position == heap.length -1;
    }

    private boolean isEmpty(){
        return heap.length == 0;
    }
    
    @Override 
    public void insert (T data){
        if(isFull()){
            resize(2 * heap.length);
        }
        heap[++position] = data;
        ReordenarArriba();
    }
    
    //Verificar que este método sea válido...
    private void resize(int capacity){
        System.arraycopy(heap, 0, heap = (T[]) new Comparable[capacity], 0, position + 1);
    }
    
    protected void intercambiar(int primero, int segundo){
        T temp = heap[primero];
        heap[primero] = heap[segundo];
        heap[segundo] = temp;
    }
    
    protected abstract void ReordenarAbajo(int Final);
    
    protected abstract void ReordenarArriba();
    
    
}
