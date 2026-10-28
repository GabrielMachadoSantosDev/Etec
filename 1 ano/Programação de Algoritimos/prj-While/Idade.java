import java.util.Scanner;

public class Idade {

	public static void main(String[] args) {
		Scanner ler= new Scanner(System.in);
		int at, an, idade = 0,i=1;
		
		while(i<=6) {
			System.out.println("Insira o ano de nascimento:");
		  an=ler.nextInt();
		  	System.out.println("Insira o ano atual");
		  	at=ler.nextInt();

		  	 idade=at-an;
			  	System.out.println("Sua idade é:"+idade);
			    
		  	
		  	if (idade<=18){
		    	System.out.println("Menor de idade");
		    	
		    }else {
		    	System.out.println("Maior de idade");
		    }
		
		   
		}
	
	
	
	
	}

}
