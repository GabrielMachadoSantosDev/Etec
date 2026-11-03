import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[20];
        int[] b = new int[20];

        for (int i = 0; i < 20; i++) {
            System.out.print("numero " + (i + 1) + ": ");
            a[i] = sc.nextInt();
        }

        int pos = 0;
        for (int i = 0; i < 20; i++) {
            if (a[i] % 2 == 0) {
                b[pos] = a[i];
                pos++;
            }
        }
        for (int i = 0; i < 20; i++) {
            if (a[i] % 2 != 0) {
                b[pos] = a[i];
                pos++;
            }
        }

        System.out.println("vetor B:");
        for (int i = 0; i < 20; i++) {
            System.out.print(b[i] + " ");
        }
        System.out.println();
        sc.close();
    }
}
