
public class exercicio2 {

	public static void main(String[] args) {
		int contador = 0;
		
		do {
			if (contador % 2 == 0) {
				System.out.println(contador);
				
				if (contador % 10 == 0) {
					System.out.println("mútiplo de 10");
				}
			}
			contador++;
		
		} while (contador < 501);

	}

}
