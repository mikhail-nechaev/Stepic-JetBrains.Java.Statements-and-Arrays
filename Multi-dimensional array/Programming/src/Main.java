import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      int n = scanner.nextInt();
      int[][] matrix = new int[n][n];
      for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
          matrix[i][j] = scanner.nextInt();
        }
      }
      int[][] tr = new int[n][n];
      for (int i = 0; i < n; i++)
        for (int j = 0; j < n; j++)
          tr[i][j] = matrix[j][i];
      for (int i = 0; i < n; i++)
        for (int j = 0; j < n; j++)
          if (matrix[i][j] != tr[i][j]) {
            System.out.println("NO");
            return;
          }
      System.out.println("YES");
    }
  }
}