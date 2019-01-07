import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      int n = scanner.nextInt();
      int[][] matrix = new int[n][n];
      int num = 1;
      for (int i = 1; i <= (n / 2) + 1; i++) {
        for (int j = i - 1; j < n - i + 1; j++) {
          matrix[i - 1][j] = num++;
        }
        for (int j = i; j < n - i + 1; j++) {
          matrix[j][n - i] = num++;
        }
        for (int j = n - i - 1; j >= i - 1; j--) {
          matrix[n - i][j] = num++;
        }
        for (int j = n - i - 1; j >= i; j--) {
          matrix[j][i - 1] = num++;
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