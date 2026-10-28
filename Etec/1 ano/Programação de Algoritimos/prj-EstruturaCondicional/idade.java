import java.util.Scanner;

public class idade {

	public static void main(String[] args){
		Scanner ler =new Scanner(System.in);
		int idade, ano, nasc;
		
		System.out.println("iforme o ano atual:");
		ano= ler.nextInt();
		
		System.out.println("informe o ano que nasceu:");
		nasc= ler.nextInt();
		
		idade=ano-nasc;
		System.out.println("Sua idade é:"+idade);
		ler.close();
		
		if(idade>=18) {
			System.out.println("Você é maior de idade");
		}
		else {
			System.out.println("Você é menor de idade");
		}
	}
	
}


