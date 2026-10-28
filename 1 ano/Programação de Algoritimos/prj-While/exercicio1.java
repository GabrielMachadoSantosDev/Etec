import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numeroImpar = 0;
		int contador = 1;
		
		do {
			if (contador % 2 == 1) {
				numeroImpar = numeroImpar + contador;
			}
			contador++;
			
		} while (contador <1000);
		System.out.println(numeroImpar);
	}

}
