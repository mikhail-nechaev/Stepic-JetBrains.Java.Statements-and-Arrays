import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      int n = scanner.nextInt();
      int m = scanner.nextInt();
      int max = Integer.MIN_VALUE;
      int row = -1;
      int col = -1;
      int[][] matrix = new int[n][m];
      for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++) {
          matrix[i][j] = scanner.nextInt();
          if (matrix[i][j] > max) {
            max = matrix[i][j];
            row = i;
            col = j;
          }
        }
      }
      System.out.println(row + " " + col);
    }
  }
}