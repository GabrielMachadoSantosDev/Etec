import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[15];
        int[] b = new int[15];

        for (int i = 0; i < 15; i++) {
            System.out.print("numero " + (i + 1) + " (0 a 12): ");
            a[i] = sc.nextInt();
            while (a[i] < 0 || a[i] > 12) {
                System.out.print("valor invalido (0 a 12): ");
                a[i] = sc.nextInt();
            }
        }

        for (int i = 0; i < 15; i++) {
            int fat = 1;
            for (int j = 2; j <= a[i]; j++) {
                fat = fat * j;
            }
            b[i] = fat;
        }

        for (int i = 0; i < 15; i++) {
            System.out.println(a[i] + "! = " + b[i]);
        }
        sc.close();
    }
}
