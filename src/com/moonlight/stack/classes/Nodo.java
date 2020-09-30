package com.moonlight.stack.classes;

/**
 *
 * @author Mark Zamudio
 */

public class Nodo {
    private String value;
    private Nodo next;

    public Nodo(String value) {
        this.value = value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public void setNext(Nodo next) {
        this.next = next;
    }

    public String getValue() {
        return value;
    }

    public Nodo getNext() {
        return next;
    } 
}
