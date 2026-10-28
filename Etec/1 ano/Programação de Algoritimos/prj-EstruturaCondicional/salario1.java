import java.util.Scanner;

public class salario1 {

	public static void main(String[] args) {
		Scanner leia=new Scanner(System.in);
		double salario,m;
		
		System.out.println("insira seu salario:");
		salario=leia.nextDouble();
		leia.close();
		
		if(salario>=1500) {
			System.out.println(" Você recebe de acordo com a lei");
		}
		else {
			System.out.println(" Você nâo recebe de acordo com a lei");
		}
	}

}
