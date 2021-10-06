package JavaArrays;

/* Faça um programa que receba 6 números inteiros e mostre: 
• Os números pares digitados;  
• A soma dos números pares digitados; 
• Os números ímpares digitados; 
• A quantidade de números ímpares digitados. */

import java.util.Scanner;

public class Array2 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int A[] = new int[6], i, somaPar = 0, contImpar = 0;
		
		for (i = 0; i < 6; i++) {
			System.out.printf(" Digite o %dº valor: ",i+1);
			A[i] = ler.nextInt();
			
			if (A[i] % 2 == 0) { somaPar += A[i]; } // Soma os números PARES
			else { contImpar++; }	// Conta a quantidade de números IMPARES
		}
		
		System.out.print("\n Números PARES digitados: ");
		for (i = 0; i < 6; i++) {
			if (A[i] % 2 == 0) {	// Condição para ser PAR
				System.out.print(" "+A[i]+" /"); }	
			} 	System.out.printf(" Soma: %d", somaPar);
		
		System.out.print("\n Números IMPARES digitados: ");
		for (i = 0; i < 6; i++) {
			if (A[i] % 2 != 0) {	// Condição para ser IMPAR
				System.out.print(" "+A[i]+" /"); }	
			} 	System.out.printf(" Quantidade: %d", contImpar);
		
	}
}
