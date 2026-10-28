import java.util.Scanner;
public class salario {
  public static void main (String[]args) { 
	double si, sf,porcentagem;
	Scanner leia=new Scanner(System.in);
	System.out.println("insira seu salario:");
	si=leia.nextDouble();
	porcentagem=si/100*10;
	sf=porcentagem+si;
	System.out.println("o salario final é:"+ sf);
 
  }
}
