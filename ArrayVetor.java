package JavaArrays;

import java.util.Scanner;

public class ArrayVetor {

	public static void main(String[] args) {
	
		Scanner ler = new Scanner(System.in);
		
		float medias[] = new float[4];	// Variavel para criar uma Array de Vetor
		float somamedia = 0, n1, n2, n3, mediageral;
		int i;
		
		for (i = 0; i < 4; i++) {
			
			System.out.printf("\n Digite a 1º nota: "); n1 = ler.nextFloat();
			System.out.printf(" Digite a 2º nota: "); n2 = ler.nextFloat();
			System.out.printf(" Digite a 3º nota: "); n3 = ler.nextFloat();
			
			medias[i] = (n1 + n2 + n3) / 3;	// Introduzindo a média na Array[i]
			
			System.out.printf(" Média do %d º aluno(a): %.2f\n",i+1,medias[i]);
			somamedia += medias[i];	// Somando a média
			
		}
		
		mediageral = somamedia / 4;	// Calculando media geral
		System.out.println("\n A Média Geral é "+mediageral);
		
	}
}
