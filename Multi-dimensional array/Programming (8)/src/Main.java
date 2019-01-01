import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int count = scanner.nextInt();
            int[][] matrix = new int[count][count];
            int n = count;
            int m = count;
            int k = 0, l = 0;
            int val = 1;
            while (k < m && l < n) {
                for (int i = l; i < n; ++i)
                    matrix[k][i] = val++;
                k++;

                for (int i = k; i < m; ++i)
                    matrix[i][n - 1] = val++;
                n--;

                if (k < m) {
                    for (int i = n - 1; i >= l; --i)
                        matrix[m - 1][i] = val++;
                    m--;
                }

                if (l < n) {
                    for (int i = m - 1; i >= k; --i)
                        matrix[i][l] = val++;
                    l++;
                }
            }
            for (int i = 0; i < count; i++) {
                for (int j = 0; j < count; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}