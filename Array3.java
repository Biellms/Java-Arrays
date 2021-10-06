package JavaArrays;

/* Leia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10 ela possui. */

import java.util.Scanner;

public class Array3 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int A[][] = new int [3][3], i, j, cont10 = 0;
		
		for(i = 0; i < 3; i++) {
			for(j = 0; j < 3; j++) {
				System.out.printf(" Coluna %d Linha %d / Valor: ",i,j);
				A[i][j] = ler.nextInt();
				if (A[i][j] > 10) { cont10++; }	// Contador de números maiores que 10
			}
		}
		
		System.out.println("\n Quantidade de números maiores que DEZ: "+cont10);
	}
}
