package com.moonlight.stack;

import com.moonlight.stack.classes.Stack;
import java.util.Scanner;

/**
 *
 * @author Mark_Zamudio
 */

public class Executable {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        Stack stack = new Stack();
        
        String value;
        int option;            
        
        do {            
            System.out.println("Que Operacion Desea Realizar: \n1.Push \n2.Pop \n3.Pila Vacia \n4.Limpiar Pila \n5.Mostrar Cima \n6.Tamaño De Pila \n7.Imprimir Pila \n8.Salir");
            option = lector.nextInt();
           
            switch (option) {
                case 1:
                    System.out.println("Digite El Valor Que Desea Agregar");
                    value = lector.next();
                    stack.push(value);
                    break;
                case 2:
                    stack.pop();
                    break;
                case 3: 
                    if (stack.isEmpty())
                        System.out.println("La Pila Esta Vacia");
                    else
                        System.out.println("La Pila Tiene Elementos");
                    
                    break;
                case 4:
                    stack.clear();
                    System.out.println("La Pila Se limpio Correctamente");
                    break;
                case 5:
                    System.out.println(stack.top());
                    break;
                case 6:
                    System.out.println("La Pila Tiene " + stack.size() + " Elementos");
                    break;
                case 7:
                    stack.print();
                    break;
                case 8:
                    System.out.println("Vuelva Pronto");
                    break;
                default:
                    System.out.println("La Opcion No Se Encuentra En El Menu");
            }
        } while (option != 8);
    }
}
