public class Ex06 {
    public static void main(String[] args) {
        int[] a = new int[11];

        for (int i = 0; i <= 10; i++) {
            int pot = 1;
            for (int j = 0; j < i; j++) {
                pot = pot * 2;
            }
            a[i] = pot;
        }

        for (int i = 0; i <= 10; i++) {
            System.out.println("A[" + i + "] = 2^" + i + " = " + a[i]);
        }
    }
}
