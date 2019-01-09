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
    int k = scanner.nextInt();

    int max = 0;
    int ctr = 0;
    int row = 0;
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        if (j != m - 1 && matrix[i][j] == 0 && matrix[i][j+1] == 0) {
          ctr++;
        } else {
          if (ctr > max) {
            max = ctr;
            row = i + 1;
          }
          ctr = 0;
        }
      }
    }
    System.out.println(row);
  }
}