import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    //put your code here
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int m = scanner.nextInt();
    int[][] matrix = new int[n][];
    for (int i = 0; i < n; i++) {
      matrix[i] = new int[m];
      for (int j = 0; j < m; j++) {
        matrix[i][j] = scanner.nextInt();
      }
    }
    int a = scanner.nextInt();
    int b = scanner.nextInt();
    for (int i = 0; i < n; i++) {
      int tmp = matrix[i][a];
      matrix[i][a] = matrix[i][b];
      matrix[i][b] = tmp;
    }

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        System.out.print(matrix[i][j] + " ");
      }
      System.out.println();
    }
  }
}