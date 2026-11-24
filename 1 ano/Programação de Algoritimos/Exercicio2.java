package exercicioMatriz;

import java.util.Random;

public class Exercicio2 {

	public static void main(String[] args) {
		Random sorteio = new Random();
		int[][] matriz = new int[3][3];
		int i, j, maior, menor, linhaMaior = 0, colunaMaior = 0, linhaMenor = 0, colunaMenor = 0;

		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				matriz[i][j] = sorteio.nextInt(100);
			}
		}

		System.out.println("Matriz 3x3:");
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				System.out.print(matriz[i][j] + "\t");
			}
			System.out.println();
		}

		maior = matriz[0][0];
		menor = matriz[0][0];

		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				if (matriz[i][j] > maior) {
					maior = matriz[i][j];
					linhaMaior = i;
					colunaMaior = j;
				}
				if (matriz[i][j] < menor) {
					menor = matriz[i][j];
					linhaMenor = i;
					colunaMenor = j;
				}
			}
		}

		System.out.println("Maior valor: " + maior + " na linha " + linhaMaior + " e coluna " + colunaMaior);
		System.out.println("Menor valor: " + menor + " na linha " + linhaMenor + " e coluna " + colunaMenor);

	}

}
