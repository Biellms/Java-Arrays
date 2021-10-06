package JavaArrays;

/* Faça um programa que possua um vetor denominado A que armazene 6 números inteiros. 
 * O programa deve executar os seguintes passos:
(a) Atribua os seguintes valores a esse vetor: 1, 0, 5, -2, -5, 7. 
(b) Armazene em uma variável inteira (simples) a soma entre os valores das posições A[0], A[1] e A[5] do vetor e mostre na tela esta soma. 
(c) Modifique o vetor na posição 4, atribuindo a esta posição o valor 100. 
(d) Mostre na tela cada valor do vetor A, um em cada linha. */

import java.util.Scanner;

public class Array1 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);

		int A[] = {1, 0, 5, -2, -5, 7}, B, i;
		
		B = A[0] + A[1] + A[5];	// Calculando a variável inteira simples
		
		System.out.println(" Array utilizado: A[] = {"+A[0]+", "+A[1]+", "+A[2]+", "+A[3]+", "+A[4]+", "+A[5]+"}");
		
		System.out.println("\n A soma dos valores A[0] + A[1] + A[5] é igual a "+B+"\n");
		
		A[4] = 100;	// Atribuindo valor na posição 4
		
		for (i = 0; i < 6; i++) {	// Exibição do Array modificado
			System.out.println(" Valor do Vetor A["+i+"] é igual a: "+A[i]);
		}
		
	}
}
