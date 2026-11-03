import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] fila = new int[10];
        int qtd = 0;
        int prox = 1;
        int op = -1;

        while (op != 0) {
            System.out.println();
            System.out.println("FILA DA MERENDA");
            System.out.println("1 - pegar senha");
            System.out.println("2 - chamar proximo");
            System.out.println("3 - ver fila");
            System.out.println("0 - sair");
            System.out.print("opcao: ");
            op = sc.nextInt();

            if (op == 1) {
                if (qtd == 10) {
                    System.out.println("fila cheia");
                } else {
                    fila[qtd] = prox;
                    System.out.println("senha gerada: " + prox);
                    qtd++;
                    prox++;
                }
            } else if (op == 2) {
                if (qtd == 0) {
                    System.out.println("fila vazia");
                } else {
                    System.out.println("senha chamada: " + fila[0]);
                    for (int i = 0; i < qtd - 1; i++) {
                        fila[i] = fila[i + 1];
                    }
                    qtd--;
                }
            } else if (op == 3) {
                if (qtd == 0) {
                    System.out.println("fila vazia");
                } else {
                    System.out.print("fila: ");
                    for (int i = 0; i < qtd; i++) {
                        System.out.print(fila[i] + " ");
                    }
                    System.out.println();
                }
            } else if (op != 0) {
                System.out.println("opcao invalida");
            }
        }
        System.out.println("fim");
        sc.close();
    }
}
