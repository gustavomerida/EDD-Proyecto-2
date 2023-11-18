/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package EDD;

/**
 *
 * @author Gustavo
 */
public interface IHeap <T extends Comparable<T>>{
    void insert(T data);
    T getRoot();
    void sort();
}
