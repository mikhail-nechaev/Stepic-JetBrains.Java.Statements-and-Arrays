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
      int k = scanner.nextInt();
      int row = 0;
      boolean prev = false;
      for (int i = 0; i < n; i++) {
        int count = 0;
        for (int j = 0; j < m; j++) {
          if (matrix[i][j] == 0) {
            count++;
            if (k == count) {
              row = ++i;
              prev = true;
              break;
            }
          } else {
            count = 0;
          }
        }
        if (prev) {
          break;
        }
      }
      System.out.println(row);
    }
  }
}