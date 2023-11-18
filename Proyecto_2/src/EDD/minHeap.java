/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EDD;

//import java.util.Arrays;

/**
 *
 * @author Gustavo
 * @param <T>
 */
public class minHeap <T extends Comparable<T>> extends Heap<T>{

    @Override
    public T getRoot() {
        //
        if(isEmpty()){
            return null;
        }
        T result = heap[0];
        heap[0] = heap[position--];
        ReordenarAbajo(position);
        return result;
    }
    
    @Override
    protected void ReordenarAbajo(int Final){
        if (Final == -1) return;
        int index = 0;
        while (index <= Final) {
            int indexhijoIzq = 2 * index +1;
            int indexhijoDer = 2 * index +2;
            if(indexhijoIzq > Final)break;
            
            //Expresión condicional ternaria. condición ? valor_si_verdadero : valor_si_falso
            int hijoAcambiar = indexhijoDer > Final 
                    ? indexhijoIzq
                    : heap[indexhijoIzq].compareTo(heap[indexhijoDer]) < 0
                        ? indexhijoIzq
                        : indexhijoDer;
            
            if (heap[index].compareTo(heap[hijoAcambiar]) < 0) break;
            intercambiar(index, hijoAcambiar);
            index = hijoAcambiar;
        }
    }

    @Override
    public void sort() {
        for (int i = 0; i <= position; i++) {
            System.out.println(heap[i]);
//            intercambiar(0, position - i);
//            ReordenarAbajo(position - i - 1);  
            
        }
//        Arrays.stream(heap).forEach(System.out::println);
    }
    
    @Override
    protected void ReordenarArriba(){
        int index = position;
        int indexPadre = (index-1) / 2;
        while (indexPadre >= 0 && heap[index].compareTo(heap[indexPadre]) < 0){
            intercambiar(index, indexPadre);
            index = indexPadre;
            indexPadre = (index -1) / 2;
        }
    }
    
    private boolean isEmpty(){
        return heap.length == 0;
    }
}
