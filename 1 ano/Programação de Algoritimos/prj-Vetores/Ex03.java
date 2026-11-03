import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("numero " + (i + 1) + ": ");
            a[i] = sc.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            int cont = 0;
            for (int d = 1; d <= a[i]; d++) {
                if (a[i] % d == 0) {
                    cont++;
                }
            }
            if (cont == 2) {
                System.out.println(a[i] + " e primo");
            } else {
                System.out.println(a[i] + " nao e primo");
            }
        }
        sc.close();
    }
}
