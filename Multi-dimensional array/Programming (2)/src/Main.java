import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int m = scanner.nextInt();
    int[][] matrix = new int[n][m];

    for (int i = 0; i < n; i++)
      for (int j = 0; j < m; j++)
        matrix[i][j] = scanner.nextInt();

    for (int i = 0; i < m; i++)
      for (int j = 0; j < n; j++)
        System.out.print(matrix[j][i] + " ");
  }
}