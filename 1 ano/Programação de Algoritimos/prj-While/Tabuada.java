import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int i=1, r, n;
		System.out.println("digite um numero e obtenha sua tabuada:");
		n = ler.nextInt();
		while(i<11) {
			r= n*i;
			System.out.println(n+"x"+i+"="+r);
			i++;
		}
	}

}
