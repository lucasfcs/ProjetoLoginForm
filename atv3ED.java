package ed.ativ3;

import java.util.ArrayDeque;
import java.util.ArrayList;

/**
 *
 * @author opaluucas
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Integer> lista = new ArrayList<>(5);      
        ArrayDeque<Integer> pilha = new ArrayDeque<>(5);     
        ArrayDeque<Integer> fila = new ArrayDeque<>(10);          
        lista.add(1);     
        lista.add(2);     
        lista.add(3);    
        lista.add(4);     
        lista.add(5);    
        System.out.printf("Lista: %s\nPilha: %s\nFila:  %s\n\n", lista, pilha, fila);
        while(!lista.isEmpty()) {         
            int elemento = lista.remove(0);         
            pilha.push(elemento);   
            System.out.printf("Lista: %s\nPilha: %s\nFila:  %s\n\n", lista, pilha, fila);
            
        }
        while(!pilha.isEmpty()) {         
            int elemento = pilha.remove();         
            fila.add(elemento);   
            System.out.printf("Lista: %s\nPilha: %s\nFila:  %s\n\n", lista, pilha, fila);
            }
        lista.add(6);     
        lista.add(7);     
        lista.add(8);    
        lista.add(9);     
        lista.add(10);     
        System.out.printf("Lista: %s\nPilha: %s\nFila:  %s\n\n", lista, pilha, fila);
        while(!lista.isEmpty()) {         
            int elemento = lista.remove(0);         
            pilha.push(elemento);   
            System.out.printf("Lista: %s\nPilha: %s\nFila:  %s\n\n", lista, pilha, fila);
            
        }
        while(!pilha.isEmpty()) {         
            int elemento = pilha.remove();         
            fila.add(elemento);   
            System.out.printf("Lista: %s\nPilha: %s\nFila:  %s\n\n", lista, pilha, fila);
            }
}}