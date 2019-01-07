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
        matrix[i][j] = 0;
      }
    }

    int i = 0;
    int j = 0;
    int x = 1;
    int startPointX = 0;
    int startpointY = 0;
    int offset = 1;
    for (int t = 0; t < n * n; t++)
    {
      if (i == startpointY && j == startPointX)
      {
        matrix[i][j] = x;
        x++;
        j++;
        continue;
      }

      if (i == startpointY && j < n - offset && j != startPointX)
      {
        matrix[i][j] = x;
        x++;
        j++;
        continue;
      }

      if (i == startpointY && j == n - offset)
      {
        matrix[i][j] = x;
        x++;
        i++;
        continue;
      }

      if (j == n - offset && i < n - offset && i != startpointY)
      {
        matrix[i][j] = x;
        x++;
        i++;
        continue;
      }

      if (j == n - offset && i == n - offset)
      {
        matrix[i][j] = x;
        x++;
        j--;
        continue;
      }

      if (i == n - offset && j > startPointX && j != n - offset)
      {
        matrix[i][j] = x;
        x++;
        j--;
        continue;
      }

      if (i == n - offset && j == startPointX)
      {
        matrix[i][j] = x;
        x++;
        i--;
        continue;
      }

      if (j == startPointX && i > offset && i != n - offset)
      {
        matrix[i][j] = x;
        x++;
        i--;
        continue;
      }

      if (j == startPointX && i == offset)
      {
        matrix[i][j] = x;
        x++;
        j++;
        startPointX++;
        startpointY++;
        offset++;
        continue;
      }

      if (x == n * n)
      {
        break;
      }


    }

    for (int h = 0; h < n; h++)
    {
      for (int k = 0; k < n; k++)
      {
        System.out.print(matrix[h][k] + " ");
      }
      System.out.println();
    }
  }
}