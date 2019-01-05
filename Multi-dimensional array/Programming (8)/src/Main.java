import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int n = scanner.nextInt();
            int[][] a = new int[n][n];
            int count = 1;

            for (int i = 1; i <= (n / 2) + 1; i++) {
                for (int j = i - 1; j < n - i + 1; j++) {
                    a[i - 1][j] = count++;
                }
                for (int j = i; j < n - i + 1; j++) {
                    a[j][n - i] = count++;
                }
                for (int j = n - i - 1; j >= i - 1; j--) {
                    a[n - i][j] = count++;
                }
                for (int j = n - i - 1; j >= i; j--) {
                    a[j][i - 1] = count++;
                }
            }

            for (int i = 0; i < n; i++){
                for (int j = 0; j < n; j++) {
                    System.out.print(a[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}