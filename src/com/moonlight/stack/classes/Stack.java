package com.moonlight.stack.classes;

import com.moonlight.stack.interfaces.StackInterface;

/**
 *
 * @author Mark_Zamudio
 */

public class Stack implements StackInterface {
    private Nodo top;

    @Override
    public void push(String value) {
        Nodo nodo = new Nodo(value);
        
        if (top == null) {
            top = nodo;
        } else {
            nodo.setNext(top);
            top = nodo;
        }
    }

    @Override
    public void pop() {
        if (isEmpty()) {
            System.out.println("La Pila Esta Vacia");
            return;
        }
        
        //Nodo aux = top;
        //System.out.println(top.getValue());
        
        top = top.getNext();
        if (top != null)
            return;
        
        //System.out.println(top.getValue());
        
        //top = top.getNext();
        //return aux.getValue();
    }
    
    @Override
    public boolean isEmpty() {
        if (top == null)
            return true;
        
        return false;
    }
    
    @Override
    public void clear() {       
        if (top == null) {            
            return;
        } else {
            top = top.getNext();
            clear();
        }
    }
    
    @Override
    public String top() {
        if (top == null)
            return "La Pila Esta Vacia";
        return top.getValue();
    }
    
    @Override
    public int size() {
        Nodo aux = top;
        int size = 0;

        while (aux != null) {
            aux = aux.getNext();
            size++;
        }
        
        return size;
    }    

    
    @Override
    public void print() { 
        Nodo aux = top; 
        
        if (aux == null) {
            System.out.println("La Pila Esta Vacia");
            return;
        } 
        
        System.out.println("Pila: ");
        
        while (aux != null) {
            System.out.println(aux.getValue() + " ");
            aux = aux.getNext();
        }
    } 
}
