package exercicioMatriz;

import java.util.Random;

public class Exercicio3 {

	public static void main(String[] args) {
		Random sorteio = new Random();
		int[][] matriz = new int[3][4];
		int i, j, soma;

		for (i = 0; i < 3; i++) {
			soma = 0;
			for (j = 0; j < 3; j++) {
				matriz[i][j] = sorteio.nextInt(10);
				soma = soma + matriz[i][j];
			}
			matriz[i][3] = soma;
		}

		System.out.println("Matriz 3x4 (a ultima coluna e a soma da linha):");
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 4; j++) {
				System.out.print(matriz[i][j] + "\t");
			}
			System.out.println();
		}

	}

}
