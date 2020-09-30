package com.moonlight.stack.interfaces;

/**
 *
 * @author Mark_Zamudio
 */

public interface StackInterface {
    public void push(String value);
    public void pop();
    public boolean isEmpty();
    public void clear();
    public String top();
    public int size();
    public void print();
}
