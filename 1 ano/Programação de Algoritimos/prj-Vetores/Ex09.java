import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[10];
        int[] b = new int[10];
        int[] c = new int[10];
        int tamC = 0;

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
            int temB = 0;
            for (int j = 0; j < 10; j++) {
                if (a[i] == b[j]) {
                    temB = 1;
                }
            }
            int jaTem = 0;
            for (int k = 0; k < tamC; k++) {
                if (a[i] == c[k]) {
                    jaTem = 1;
                }
            }
            if (temB == 1 && jaTem == 0) {
                c[tamC] = a[i];
                tamC++;
            }
        }

        if (tamC == 0) {
            System.out.println("nao tem intersecao");
        } else {
            System.out.print("intersecao: ");
            for (int i = 0; i < tamC; i++) {
                System.out.print(c[i] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
