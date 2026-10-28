import java.util.Scanner;
public class conversaoEuro {
	public static void main(String[]args){
	 double ve,reais;
	 Scanner leia = new Scanner(System.in);
	 System.out.println("insira o valor do euro");
	 ve = leia.nextDouble();
	 reais = ve * 5.87;
	 System.out.println("o valor convertido é:" + reais);
	 leia.close();	
	}
}
