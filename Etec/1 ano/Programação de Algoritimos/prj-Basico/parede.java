import java.util.Scanner;
public class parede {
 public static void main(String[]args) {
	 double j,largura,quantidade,comprimento;
	 Scanner leia=new Scanner(System.in);
	 System.out.println("insira o comprimento:");
	 comprimento=leia.nextDouble();
	 System.out.println("insira a largura:");
	 largura=leia.nextDouble();
	 j=comprimento*largura;
	 quantidade=j/3.8;
	 System.out.println("a quantidade é:"+quantidade);
	 
	 
 
 }
}