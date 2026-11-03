import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("numero " + (i + 1) + ": ");
            a[i] = sc.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            System.out.print("pares de 0 ate " + a[i] + ": ");
            for (int j = 0; j <= a[i]; j += 2) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
