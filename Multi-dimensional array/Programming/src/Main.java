import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int n = scan.nextInt();
    int[][] matrix = new int[n][n];
    for (int i = 0; i < n; i++)
    {
      for (int j = 0; j < n; j++)
      {
        matrix[i][j] = scan.nextInt();
      }
    }

    boolean isSym = true;
    for (int i = 0; i < n; i++)
    {
      for (int j = 0; j < n; j++)
      {
        if (matrix[i][j] != matrix[j][i])
        {
          isSym = false;
        }
      }
    }

    if (isSym)
    {
      System.out.print("YES");
    }
    else
    {
      System.out.print("NO");
    }


  }
}