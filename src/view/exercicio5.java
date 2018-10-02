/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.Scanner;

/**
 *
 * @author Carlos
 */
 import java.util.Scanner;
public class exercicio5 {
   


	 
	 
         
          public static int[] inverter(int vector[],int tamanhoI,int tamanhoF){
	         int aux;
	         if(tamanhoI>=tamanhoF){
	             return vector;
	         }else{
	         aux=vector[tamanhoI];
	         vector[tamanhoI] = vector[tamanhoF];
	         vector[tamanhoF]=aux;
	         return inverter(vector,tamanhoI+1,tamanhoF-1);
	         }
	         }
	     
	     public static void inserirItem(int vector[]){
	       
	       Scanner ju=new Scanner(System.in);
	       for(int j =0;j<vector.length;j++){
	       System.out.println("Insira  o ("+(j+1)+"o)elemento ");
	       vector[j]=ju.nextInt();
	   }
	   } 
	 
	 
	  public static void imprimir(int vet[]){
		   System.out.print("Vector [");
		  for(int k=0;k<vet.length;k++){
	       System.out.print(" "+vet[k]);
	       }
		  System.out.print(" ]");
		    System.out.println();
	      
	    }
	   
	     
	    
	     
	     
	     public static void main(String[] args) {
	       Scanner ju=new Scanner (System.in);
	         int vector[];
	         System.out.println("Insira o tamanho do array:");
	         int tam=ju.nextInt();
	         vector = new int[tam];                     
	         inserirItem(vector);
	          System.out.println("***Vector**nao**invertido***");
	         imprimir(vector);
	         int tamanho=0;
	         int tamm = vector.length-1;
	         inverter(vector,tamanho,tamm);
	         System.out.println("***Vector**Invertido***");
	         imprimir(vector);
	       
	     }
	     
	    
}
    
