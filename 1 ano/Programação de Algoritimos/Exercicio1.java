package exercicioMatriz;

public class Exercicio1 {

	public static void main(String[] args) {
		int[][] matriz = new int[4][4];
		int i, j, valor = 2;

		for (i = 0; i < 4; i++) {
			for (j = 0; j < 4; j++) {
				matriz[i][j] = valor;
				valor = valor * 2;
			}
		}

		System.out.println("Matriz 4x4:");
		for (i = 0; i < 4; i++) {
			for (j = 0; j < 4; j++) {
				System.out.print(matriz[i][j] + "\t");
			}
			System.out.println();
		}

	}

}
