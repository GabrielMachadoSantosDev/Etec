import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o final da placa do carro");
		int placaCarro = sc.nextInt();

		switch (placaCarro) {
		case 1:
		case 2:
			System.out.println("Segunda feira não circule com o seu veículo");
			break;
		case 3:
		case 4:
			System.out.println("Terça feira não circule com o seu veículo");
			break;
		case 5:
		case 6:
			System.out.println("Quarta feira não circule com o seu veículo");
			break;
		case 7:
		case 8:
			System.out.println("Quinta feira não circule com o seu veículo");
			break;
		case 9:
		case 0:
			System.out.println("Sexta feira não circule com o seu veículo");
			break;
		
		}

	}

}
