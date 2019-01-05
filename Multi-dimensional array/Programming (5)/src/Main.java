import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            int[][] a = new int[n][m];

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    a[i][j] = scanner.nextInt();
                }
            }

            int k = scanner.nextInt();
            int l = scanner.nextInt();

            for (int i = 0; i < n; i++) {
                int tmp = a[i][k];
                a[i][k] = a[i][l];
                a[i][l] = tmp;
            }

            for (int i = 0; i < n; i++){
                for (int j = 0; j < m; j++) {
                    System.out.print(a[i][j] + " ");
                }
                System.out.println();
            }

        }
    }
}