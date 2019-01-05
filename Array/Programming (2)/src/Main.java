import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int n = scanner.nextInt();
            int[] a = new int[n];
            if (n == 1) {
                System.out.println(scanner.nextInt());
            } else {
                int max = 0;
                a[0] = scanner.nextInt();
                for (int i = 1; i < n; i++) {
                    a[i] = scanner.nextInt();
                    if (a[i] * a[i - 1] > max) {
                        max = a[i] * a[i - 1];
                    }
                }
                System.out.println(max);
            }
        }
    }
}