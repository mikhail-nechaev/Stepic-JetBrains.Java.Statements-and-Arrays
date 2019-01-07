import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int n = scan.nextInt();
    int m = scan.nextInt();
    int[][] matrix = new int[n][m];
    for (int i = 0; i < n; i++)
    {
      for (int j = 0; j < m; j++)
      {
        matrix[i][j] = scan.nextInt();
      }
    }

    int[][] matrix2 = new int[m][n];

    for (int i = 0; i < n; i++)
    {
      for (int j = 0; j < m; j++)
      {
        matrix2[j][n - 1 - i] = matrix[i][j];
      }
    }

    for (int i = 0; i < m; i++)
    {
      for (int j = 0; j < n; j++)
      {
        System.out.print(matrix2[i][j] + " ");
      }
      System.out.println();
    }
  }
}