import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int m = scanner.nextInt();
    int n = scanner.nextInt();
    int[][] matrix = new int[n][m];
    int temp;
    for (int i = 0; i < m; i++)
      for (int j = 0; j < n; j++)
        matrix[i][j] = scanner.nextInt();

    int a = scanner.nextInt();
    int b = scanner.nextInt();


    for (int j = 0; j < m; j++) {
      temp = matrix[a][j];
      matrix[a][j] = matrix[b][j];
      matrix[b][j] = temp;
    }
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++)
        System.out.print(matrix[i][j] + " ");
      System.out.println();
    }
  }
}