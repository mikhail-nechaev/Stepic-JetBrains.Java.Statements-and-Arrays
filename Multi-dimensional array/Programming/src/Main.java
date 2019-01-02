import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    String result = "YES";
    int[][] matrix = new int[n][n];

    for (int i = 0; i < n; i++)
      for (int j = 0; j < n; j++)
        matrix[i][j] = scanner.nextInt();

    for (int i = 0; i < n; i++)
      for (int j = 0; j < n; j++)
        if (matrix[i][j] != matrix[j][i])
          result = "NO";

    System.out.println(result);
  }
}