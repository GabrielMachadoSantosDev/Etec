import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("numero " + (i + 1) + ": ");
            a[i] = sc.nextInt();
        }

        for (int i = 0; i < 5; i++) {
            System.out.println("tabuada do " + a[i] + ":");
            for (int j = 1; j <= 10; j++) {
                System.out.println(a[i] + " x " + j + " = " + (a[i] * j));
            }
            System.out.println();
        }
        sc.close();
    }
}
