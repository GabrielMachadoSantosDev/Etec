import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);

		int n, soma = 0;
		
		System.out.println("Insira um número");
		n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.println(i);
			soma += i;
		}

		System.out.println("Soma = " + soma);
	
		sc.close();
	
	}

}
