import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[10];
        int[] b = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("numero " + (i + 1) + ": ");
            a[i] = sc.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            if (a[i] % 2 == 0) {
                b[i] = 1;
            } else {
                b[i] = 0;
            }
        }

        for (int i = 0; i < 10; i++) {
            System.out.println("A[" + i + "] = " + a[i] + "  B[" + i + "] = " + b[i]);
        }
        sc.close();
    }
}
