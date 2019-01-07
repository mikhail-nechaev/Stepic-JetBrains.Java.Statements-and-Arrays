import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      int n = scanner.nextInt();
      String[][] matrix = new String[n][n];
      for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
          if (i == j || i == n - j - 1 || j == n / 2 || i == n / 2) {
            matrix[i][j] = "*";
          } else {
            matrix[i][j] = ".";
          }
        }
      }
      for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
          System.out.print(matrix[i][j] + " ");
        }
        System.out.println();
      }
    }
  }
}