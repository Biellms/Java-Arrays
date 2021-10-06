package JavaArrays;

import java.util.Scanner;

public class ArrayMatriz {

	public static void main(String[] args) {
	
		Scanner ler = new Scanner(System.in);
		
		int numeros[][] = new int[2][3];	// Variavel para criar uma Array de Matriz
		int i, j, contPar = 0, contImpar = 0;
		
		for (i = 0; i < 2; i++) {	// Implementação da Array[2][3]
			for (j = 0; j < 3; j++) {
				System.out.print(" Digite um número: ");
				numeros[i][j] = ler.nextInt();
			}
		}
		
		for (i = 0; i < 2; i++) {	// Exibição e Contador de números PARES e IMPARES
			for (j = 0; j < 3; j++) {
				if (numeros[i][j] % 2 == 0) { 
					System.out.println("\n Este número é PAR --> "+numeros[i][j]);
					contPar++;
				} else { 
					System.out.println("\n Este número é IMPAR --> "+numeros[i][j]); 
					contImpar++;
				}
			}
		}
		
		System.out.println("\n Temos "+contPar+" números PARES");
		System.out.println(" Temos "+contImpar+" números IMPARES");
	}
}
