import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("numero " + (i + 1) + ": ");
            a[i] = sc.nextInt();
        }

        int ini = 0;
        int fim = 9;
        int pali = 1;
        while (ini < fim && pali == 1) {
            if (a[ini] != a[fim]) {
                pali = 0;
            }
            ini++;
            fim--;
        }

        if (pali == 1) {
            System.out.println("o vetor e palindromo");
        } else {
            System.out.println("o vetor nao e palindromo");
        }
        sc.close();
    }
}
