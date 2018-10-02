/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author Carlos
 */
 import java.util.ArrayDeque;
import java.util.ArrayList;

public class exercicio7 {
    
   
	
	public static void main(String[] args) {
		  
                ArrayDeque deque=new ArrayDeque();
                ArrayList lista=new ArrayList();
                System.out.println(" DEQUE ");
               
                deque.addLast(1);
                deque.addLast(2);
                deque.addLast(3);
                deque.addLast(4);
                deque.addLast(5);
                deque.addLast(6);
                deque.addLast(7);
                deque.addLast(8);
           
                System.out.println(deque+"\n");
                  
               boolean add = lista.add(deque.removeFirst());
       
               lista.add(deque.removeFirst());
               lista.add(deque.removeFirst());
               lista.add(deque.removeFirst());
               lista.add(deque.removeFirst());
               lista.add(deque.removeFirst());
               lista.add(deque.removeFirst());
               lista.add(deque.removeFirst());
        
               
               System.out.println(" Vector ");
                System.out.print(lista+"\n");
                 System.out.println(" Deque "+"\n");
                   System.out.println(deque);
    }

    
}
