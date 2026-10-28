import java.util.Scanner;

public class exerciocio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int anoAtual, anoNascimento, idade;
		String resposta;
		
		do {
			anoAtual = 0;
			anoNascimento = 0;
			idade = 0;
			 System.out.println("Digite o ano de nascimento");
			 anoNascimento = sc.nextInt();
			 
			 System.out.println("Digite o ano atual");
			 anoAtual = sc.nextInt();
			 
			 do {
				 idade = anoAtual - anoNascimento;
				 if (idade >= 18) {
					 System.out.println("Maior de idade");
				 } else {
					 System.out.println("Menor de idade");
				 }
			 } while (idade == 0);
			 System.out.println("Deseja continuar? S para Sim ou N para Não");
			   resposta = sc.next();
			 
		} while (resposta.equalsIgnoreCase("S"));
		
sc.close();
	}

}
