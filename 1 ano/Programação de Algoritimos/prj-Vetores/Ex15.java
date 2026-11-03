import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[10];
        int[] b = new int[10];
        int[] c = new int[10];

        System.out.println("vetor A:");
        for (int i = 0; i < 10; i++) {
            System.out.print("numero " + (i + 1) + ": ");
            a[i] = sc.nextInt();
        }
        System.out.println("vetor B:");
        for (int i = 0; i < 10; i++) {
            System.out.print("numero " + (i + 1) + ": ");
            b[i] = sc.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            if (a[i] > b[i]) {
                c[i] = 1;
            } else if (a[i] == b[i]) {
                c[i] = 0;
            } else {
                c[i] = -1;
            }
        }

        for (int i = 0; i < 10; i++) {
            System.out.println("A=" + a[i] + "  B=" + b[i] + "  C=" + c[i]);
        }
        sc.close();
    }
}
