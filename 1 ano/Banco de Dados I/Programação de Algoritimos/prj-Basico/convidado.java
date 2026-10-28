import java.util.Scanner;
public class convidado {
	public static void main(String[]args) {
		int cf,cm,salgadosm,salgadosf,docesm,docesf,total,tsal,tdc;
		double bolo,bebidam,bebidaf,tbe;
		Scanner leia = new Scanner(System.in);
		System.out.println("insira a quantidade de convidados do sexo masculino");
		cm = leia.nextInt();
		salgadosm =cm*15;
		System.out.println("insira a quantidade de convidados do sexo feminino");
		cf= leia.nextInt();
		salgadosf=cf*10;
		docesm=cm*6;
		docesf=cf*8;
		total = cm+cf;
		bolo=total*100;
		bebidam=cm*0.600;
		bebidaf=cf*0.500;
		tsal=salgadosf+salgadosm;
		tbe=bebidam+bebidaf;
		tdc=docesm+docesf;
		System.out.println("total de salgados em unidades é:"+tsal);
		System.out.println("total  de doces em unidades é:"+ tdc);
		System.out.println("total de bebidas em litros é:"+tbe);
		System.out.println("total em gramas de bolo é:"+bolo);
		leia.close();
		
	}

}
