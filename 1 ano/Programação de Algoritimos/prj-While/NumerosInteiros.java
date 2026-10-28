

public class NumerosInteiros {

	public static void main(String[] args) {
		int i=0;
		int soma = 1;
		
		while (soma<=100) {
			soma = soma+=1;
			System.out.println(soma);
			i = i + soma;
		}
		System.out.println(i);

	}

}
