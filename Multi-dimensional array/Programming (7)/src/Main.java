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

    int tickets = scan.nextInt();
    int row = -1;
    int count = 0;
    int maxCount = 0;
    int prev_s = -1;

    for (int i = n - 1; i >= 0; i--)
    {
      for (int j = 0; j < m; j++)
      {
        if ((matrix[i][j] == 0) && (j == prev_s + 1 || prev_s == -1))
        {
          prev_s = j;
          count++;
          if (maxCount < count)
          {
            maxCount = count;
          }
        }
        else
        {
          count = 0;
          prev_s = -1;
        }
      }
      if (maxCount >= tickets)
      {
        row = i;
      }
      count = 0;
      maxCount = 0;
      prev_s = -1;
    }


    System.out.print(row + 1);

  }
}