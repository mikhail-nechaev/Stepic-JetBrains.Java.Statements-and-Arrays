import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int n = scan.nextInt();
    int[][] matrix = new int[n][n];

    int j = 0;
    for (int i = 0; i < n; i++)
    {
      int t = i;
     while (t != n)
     {
       matrix[j][t] = i;
       matrix[t][j] = i;
       ++t;
       ++j;
     }
     j = 0;
    }

    for (int i = 0; i < n; i++)
    {
      for (int t = 0; t < n; t++)
      {
        System.out.print(matrix[i][t] + " ");
      }
      System.out.println();
    }
  }
}