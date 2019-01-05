import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            int[][] a = new int[n][m];
            int max = Integer.MIN_VALUE;
            int maxI = 0;
            int maxJ = 0;

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    a[i][j] = scanner.nextInt();
                    if (a[i][j] > max) {
                        max = a[i][j];
                        maxI = i;
                        maxJ = j;
                    }
                }
            }

            System.out.println(maxI + " " + maxJ);
        }
    }
}