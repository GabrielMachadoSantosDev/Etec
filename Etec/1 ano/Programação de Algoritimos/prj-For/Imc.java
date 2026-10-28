import java.util.Scanner;

public class Imc {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double baixoPeso = 0, normal = 0, sobrepeso = 0, obesidade = 0, peso = 0, altura = 0, imc = 0;
		
		for (int i = 0; i < 5; i++ ) {
			System.out.println("Digite o peso");
			peso = sc.nextDouble();
			
			System.out.println("Digite a altura");
			altura = sc.nextDouble();
			
			imc = (peso/altura) * altura;
			
			if (imc < 22) {
				System.out.println("Baixo pesotr");
				baixoPeso++;
			}
			
			if (imc >= 22 && imc <= 27) {
				System.out.println("Normal");
				normal++;
			}
			
			if (imc > 27 && imc <= 29.99) {
				System.out.println("sobrepeso");
				sobrepeso++;
			}
			
			if (imc > 30) {
				System.out.println("obesidade");
				obesidade++;
			}
			
		}

		System.out.println("baixoPeso" + baixoPeso);
		System.out.println("normal" + normal);
		System.out.println("sobrepeso" + sobrepeso);
		System.out.println("obesidade" + obesidade);
	}

}
