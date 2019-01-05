import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int n = scanner.nextInt();
            int[] a = new int[n];
            int max = 0;
            int j = 0;
            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
                if (max < a[i]) {
                    max = a[i];
                    j = i;
                }
            }
            System.out.println(j);
        }
    }
}