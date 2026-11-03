import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[10];
        int[] b = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("numero " + (i + 1) + ": ");
            a[i] = sc.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            int soma = 0;
            for (int j = i; j < 10; j++) {
                soma = soma + a[j];
            }
            b[i] = soma;
        }

        for (int i = 0; i < 10; i++) {
            System.out.println("B[" + i + "] = " + b[i]);
        }
        sc.close();
    }
}
