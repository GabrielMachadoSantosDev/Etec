import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("numero " + (i + 1) + ": ");
            a[i] = sc.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            int n = a[i];
            if (n < 0) {
                n = -n;
            }
            if (n == 0) {
                System.out.println("0 tem infinitos divisores");
            } else {
                System.out.print("divisores de " + a[i] + ": ");
                for (int d = 1; d <= n; d++) {
                    if (n % d == 0) {
                        System.out.print(d + " ");
                    }
                }
                System.out.println();
            }
        }
        sc.close();
    }
}
