package JavaArrays;

/* Fa�a um programa que receba 6 n�meros inteiros e mostre: 
� Os n�meros pares digitados;  
� A soma dos n�meros pares digitados; 
� Os n�meros �mpares digitados; 
� A quantidade de n�meros �mpares digitados. */

import java.util.Scanner;

public class Array2 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int A[] = new int[6], i, somaPar = 0, contImpar = 0;
		
		for (i = 0; i < 6; i++) {
			System.out.printf(" Digite o %d� valor: ",i+1);
			A[i] = ler.nextInt();
			
			if (A[i] % 2 == 0) { somaPar += A[i]; } // Soma os n�meros PARES
			else { contImpar++; }	// Conta a quantidade de n�meros IMPARES
		}
		
		System.out.print("\n N�meros PARES digitados: ");
		for (i = 0; i < 6; i++) {
			if (A[i] % 2 == 0) {	// Condi��o para ser PAR
				System.out.print(" "+A[i]+" /"); }	
			} 	System.out.printf(" Soma: %d", somaPar);
		
		System.out.print("\n N�meros IMPARES digitados: ");
		for (i = 0; i < 6; i++) {
			if (A[i] % 2 != 0) {	// Condi��o para ser IMPAR
				System.out.print(" "+A[i]+" /"); }	
			} 	System.out.printf(" Quantidade: %d", contImpar);
		
	}
}
