/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package EDD;
import javaapplication7.*;
/**
 *
 * @author Gustavo
 * @param <Documento>
 */

/**
 *Montículo Binario
 * Version 2.
 */
public class Heap{
    protected Documento[] heap;
    protected int position = -1;
    
    public Heap(){
        heap = new Documento[10]; //Porque es un arreglo que que puede crecer
    }
    
    /**
     * Verifica que el monticulo esté lleno.
     */
    private boolean isFull(){
        return position == heap.length -1;
    }

    /**
     * Verifica que el monticulo esté vacío.
     * @return 
     */
    public boolean isEmpty(){
        return heap.length == 0;
    }
    
    /**
     * Primitiva insertar del monticulo.
     * @param data: Documento a insertar.
     */
    public void insert (Documento data){
        if(isFull()){
            resize(2 * heap.length);
        }
        heap[++position] = data;
//        ReordenarArriba();
    }
    
    //Verificar que este método sea válido...
    
    /**
     * Cambia el tamaño del arreglo en caso de estar lleno.
     * @param capacity: nuevo tamaño del arreglo.
     */
    private void resize(int capacity){
        System.arraycopy(heap, 0, heap = new Documento[capacity], 0, position + 1);
    }
    
    /**
     * Intercambia el lugar de dos elementos que se encuentren en el monticulo.
     * @param primero: primer elemento a intercambiar.
     * @param: segundo: segundo elemento a intercambiar con el primero. 
     */
    protected void intercambiar(int primero, int segundo){
        Documento temp = heap[primero];
        heap[primero] = heap[segundo];
        heap[segundo] = temp;
    }
    
    /**
     * Primitiva Eliminar_min del monticulo. 
     * Quita y devuelve el elemento con el menor valor, que se encuentra en la raiz.
     * @return la raiz del moticulo.
     */
    public Documento getRoot() {
        //
        if(isEmpty()){
            return null;
        }
        Documento result = heap[0];
        heap[0] = heap[position--];
        ReordenarAbajo(position);
        return result;
    }
    
    /**
     * Ordena el montúculo hacia abajo, comenzando desde la raíz.
     * @param Final: indice final.
     */
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

    /**
     * Muestra los elementos del montículo.
     */  
    public void show() {
        
        for (int i = 0; i <= position; i++) {
            System.out.println(heap[i].getNombre());
           
//            intercambiar(0, position - i);
//            ReordenarAbajo(position - i - 1);  
            
        }
//        Arrays.stream(heap).forEach(System.out::println);
    }

    public void sort() {

        for (int i = 0; i <= position; i++) {
            intercambiar(0, position - i);
//            ReordenarAbajo(position - i - 1);  
        }
    }

    /**
     * Ordena el montúculo hacia arriba, comenzando desde el final.
     */
    protected void ReordenarArriba(){
        int index = position;
        int indexPadre = (index-1) / 2;
        while (indexPadre >= 0 && heap[index].compareTo(heap[indexPadre]) < 0){
            intercambiar(index, indexPadre);
            index = indexPadre;
            indexPadre = (index -1) / 2;
        }
    }
    
    public void Eliminar (String S){
        for (int i = 0; i <= heap.length; i++){
            if (S.equals(heap[0].getNombre())){
                getRoot();
                sort();
            }
            else {
                Documento x = this.getRoot();
                insert(x);
                sort();
            }
        }
    }
}
