import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("numero " + (i + 1) + ": ");
            a[i] = sc.nextInt();
        }

        System.out.print("numero para buscar: ");
        int x = sc.nextInt();

        int achou = 0;
        for (int i = 0; i < 10; i++) {
            if (a[i] == x) {
                System.out.println(x + " encontrado na posicao " + i);
                achou = 1;
            }
        }
        if (achou == 0) {
            System.out.println(x + " nao encontrado");
        }
        sc.close();
    }
}
