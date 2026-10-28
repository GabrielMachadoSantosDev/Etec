import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o número do mês");
		int numeroMes = sc.nextInt();

		switch (numeroMes) {
		case 1:
		case 3:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("Este mês possui 31 dias");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("Este mês possui 30 dias");
			break;
		case 2:
			System.out.println("Este mês possui 28 dias");
			break;
		default:
			System.out.println("Mês invalido");

		}

	}

}
