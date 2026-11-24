package exercicioMatriz;

import java.util.Random;

public class Exercicio4 {

	public static void main(String[] args) {
		Random sorteio = new Random();
		int[][] cartela = new int[4][4];
		int[] usados = new int[76];
		int[] cantados = new int[76];
		int i, j, numero, acertos = 0, rodadas = 0, achou;

		for (i = 0; i < 4; i++) {
			for (j = 0; j < 4; j++) {
				numero = sorteio.nextInt(75) + 1;
				while (usados[numero] == 1) {
					numero = sorteio.nextInt(75) + 1;
				}
				usados[numero] = 1;
				cartela[i][j] = numero;
			}
		}

		System.out.println("Sua cartela:");
		for (i = 0; i < 4; i++) {
			for (j = 0; j < 4; j++) {
				if (cartela[i][j] < 10) {
					System.out.print("0");
				}
				System.out.print(cartela[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println();

		while (acertos < 16) {
			numero = sorteio.nextInt(75) + 1;
			while (cantados[numero] == 1) {
				numero = sorteio.nextInt(75) + 1;
			}
			cantados[numero] = 1;
			rodadas++;

			achou = 0;
			for (i = 0; i < 4; i++) {
				for (j = 0; j < 4; j++) {
					if (cartela[i][j] == numero) {
						cartela[i][j] = 0;
						acertos++;
						achou = 1;
					}
				}
			}

			if (achou == 1) {
				System.out.println("Numero cantado: " + numero + " - a cartela TEM esse numero (acertos: " + acertos + ")");
			} else {
				System.out.println("Numero cantado: " + numero + " - a cartela NAO tem esse numero");
			}
		}

		System.out.println();
		System.out.println("BINGO!");
		System.out.println("Rodadas para acertar: " + rodadas);

	}

}
