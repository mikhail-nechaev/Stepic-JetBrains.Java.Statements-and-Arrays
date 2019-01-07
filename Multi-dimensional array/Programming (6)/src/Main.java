import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int n = scan.nextInt();
    char[][] matrix = new char[n][n];

    int mid = n / 2;
    for (int i = 0; i < n; i++)
    {
      for (int j = 0; j < n; j++)
      {
        if (j == mid || i == mid || i == j)
        {
          matrix[i][mid] = '*';
          matrix[mid][j] = '*';
          matrix[i][i] = '*';
        }
        else
        {
          matrix[i][j] = '.';
        }
      }
    }

    int t = 0;
    int h = n - 1;
    while (t != n)
    {
      matrix[h][t] = '*';
      t++;
      h--;
    }

    for (int i = 0; i < n; i++)
    {
      for (int j = 0; j < n; j++)
      {
        System.out.print(matrix[i][j] + " ");
      }
      System.out.println();
    }
  }
}