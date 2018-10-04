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
import java.util.Scanner;

public class exercicio6 {
    
    //yess

	private static void mover(int Origem, int Destino) {
		System.out.println(Origem + " -> " + Destino);
	}

	static void hanoi(int i, int Origem, int Destino, int Trabalho) {

            
		if (i> 0) {
			hanoi(i- 1, Origem, Trabalho, Destino);
			mover(Origem, Destino);
			hanoi(i - 1, Trabalho, Destino, Origem);
		}

	}
	
	
	
	public static void main(String[] args) {

		int a; //aneis
		Scanner entrada = new Scanner(System.in);
		System.out.println("Insira a quantidade de discos: ");
		a = entrada.nextInt();

	
		hanoi(a, 1, 3, 2);
	}
}

    

