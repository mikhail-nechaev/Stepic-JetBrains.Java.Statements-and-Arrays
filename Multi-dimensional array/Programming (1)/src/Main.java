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

    int max = Integer.MIN_VALUE;
    int row = 0, column = 0;

    for (int i = 0; i < n; i++)
    {
      for (int j = 0; j < m; j++)
      {
        if (matrix[i][j] > max)
        {
          max = matrix[i][j];
          row = i;
          column = j;
        }
      }
    }

    System.out.print(row + " " + column);
  }
}