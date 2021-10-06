package JavaArrays;

/* Fa�a um programa que leia duas matrizes 2 x 2 com valores reais. 
 * Ofere�a ao usu�rio um menu de op��es:
1) somar as duas matrizes 
2) subtrair a primeira matriz da segunda 
3) adicionar uma constante as duas matrizes
4) imprimir as matrizes 
Nas duas primeiras op��es uma terceira matriz 2 x 2 deve ser criada. 
Na terceira op��o o valor da constante deve ser lido e o resultado da 
adi��o da constante deve ser armazenado na pr�pria matriz.
*/

import java.util.Scanner;

public class Array4 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);

		int A[][] = new int[2][2], B[][] = new int[2][2], C[][] = new int[2][2], op, i, j, constante;
		
		// Implementa��o dos Arrays
		System.out.println("\n Implemente a PRIMEIRA matriz");	// Matriz 1
		for (i = 0; i < 2; i++) {
			for (j = 0; j < 2; j++) {
				System.out.printf(" Coluna %d Linha %d / Valor: ",i,j); A[i][j] = ler.nextInt();
			}
		}
		System.out.println("\n Implemente a SEGUNDA matriz");	// Matriz 2
		for (i = 0; i < 2; i++) {
			for (j = 0; j < 2; j++) {
				System.out.printf(" Coluna %d Linha %d / Valor: ",i,j); B[i][j] = ler.nextInt();
			}
		}
		
		do {
		// MENU DE OP��ES
		System.out.println("\n -------------------------------------------");
		System.out.println(" Escolha uma op��o para EXECUTAR ");
		System.out.println(" 1) Somar as duas matrizes");
		System.out.println(" 2) Subtrair a primeira matriz da segunda");
		System.out.println(" 3) Adicionar uma constante as duas matrizes");
		System.out.println(" 4) Imprimir as matrizes");
		System.out.println(" 5) Sair");
		System.out.print(" Op��o: "); op = ler.nextInt();
		
		
		switch (op) {
			
		case 1:
			System.out.print("\n -------------------------------------------");
			System.out.println("\n 1) Somar as duas matrizes");
			for (i = 0; i < 2; i++) {
				for (j = 0; j < 2; j++) {
					C[i][j] = A[i][j] + B[i][j];	// Calculo para a SOMA das Matrizes
					System.out.println(" A["+i+"]["+j+"] + B["+i+"]["+j+"] / "+A[i][j]+" + "+B[i][j]+" � igual a: "+C[i][j]);
				}
			}
		break;
		
		case 2:
			System.out.print("\n -------------------------------------------");
			System.out.println("\n 2) Subtrair a primeira matriz da segunda");
			for (i = 0; i < 2; i++) {
				for (j = 0; j < 2; j++) {
					C[i][j] = A[i][j] - B[i][j];	// Calculo para a SUBTRA��O das Matrizes
					System.out.println(" A["+i+"]["+j+"] - B["+i+"]["+j+"] / "+A[i][j]+" - "+B[i][j]+" � igual a: "+C[i][j]);
				}
			}
		break;
		
		case 3:
			System.out.print("\n -------------------------------------------");
			System.out.println("\n 3) Adicionar uma constante as duas matrizes");
			System.out.print("\n Digite uma constante: "); constante = ler.nextInt();
            
            for (i = 0; i < 2; i++){
               for (j = 0; j < 2; j++) {
                    A[i][j] += constante;	// LOOP para SOMAR a CONSTANTE com a Matriz A[i][j]
                    B[i][j] += constante;	// LOOP para SOMAR a CONSTANTE com a Matriz B[i][j]
               }
           }
		break;
		
		case 4:
			System.out.print("\n -------------------------------------------");
			System.out.println("\n 4) Imprimir as matrizes");
			System.out.println("\n Matriz 1");
			for (i = 0; i < 2; i++) {
				for (j = 0; j < 2; j++) {
					System.out.printf(" Coluna %d Linha %d / Valor: %d\n", i, j, A[i][j]);
				}
			}
			System.out.println("\n Matriz 2");
			for (i = 0; i < 2; i++) {
				for (j = 0; j < 2; j++) {
					System.out.printf(" Coluna %d Linha %d / Valor: %d\n", i, j, B[i][j]);
				}
			}
		break;
		case 5: System.exit(0); break;
		default: { System.out.println("\n OP��O INV�LIDA!!"); } break;
		
			}
		System.out.print(" Digite 1 para Voltar e 0 para sair: "); op = ler.nextInt();
		} while (op != 0);	// Enquanto n�o for igual a 0, a fun��o retorna ao MENU DE OP��ES
	}
}
