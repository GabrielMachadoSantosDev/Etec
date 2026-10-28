import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int anoInicial = 0, anoFinal = 0, anoBissexto = 0;
		
		System.out.println("Insira o ano inicial:");
		anoInicial = sc.nextInt();
		
		System.out.println("Insira o ano final:");
		anoFinal = sc.nextInt();
		
		for(int i = anoInicial; i <= anoFinal;i++) {
				
			if (i % 400 == 0 || (i % 4 == 0 && i % 100 != 0)) {
				System.out.println(i);
				anoBissexto++;
			}
		}

		System.out.println("Quantidade de anos bissextos: " + anoBissexto);
		
		sc.close();
		
	}

}
