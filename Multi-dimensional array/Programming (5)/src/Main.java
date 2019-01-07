import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      int n = scanner.nextInt();
      int m = scanner.nextInt();
      int[][] matrix = new int[n][m];
      for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++) {
          matrix[i][j] = scanner.nextInt();
        }
      }
      int i = scanner.nextInt();
      int j = scanner.nextInt();
      for (int k = 0; k < n; k++) {
        int val = matrix[k][i];
        matrix[k][i] = matrix[k][j];
        matrix[k][j] = val;
      }
      for (i = 0; i < n; i++) {
        for (j = 0; j < m; j++) {
          System.out.print(matrix[i][j] + " ");
        }
        System.out.println();
      }
    }
  }
}