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

    int col_1 = scan.nextInt();
    int col_2 = scan.nextInt();

    int tmp = 0;

    for (int i = 0; i < n; i++)
    {
      tmp = matrix[i][col_1];
      matrix[i][col_1] = matrix[i][col_2];
      matrix[i][col_2] = tmp;
    }

    for (int i = 0; i < n; i++)
    {
      for (int j = 0; j < m; j++)
      {
        System.out.print(matrix[i][j] + " ");
      }
      System.out.println();
    }
  }
}