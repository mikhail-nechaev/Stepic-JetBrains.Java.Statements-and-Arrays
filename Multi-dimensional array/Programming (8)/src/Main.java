import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    int n = new Scanner(System.in).nextInt();
    int[][] m = new int[n][n];

    int t = 1;
    int num = 1;
    while (num <= n * n) {
      for (int j = t - 1; j <= n - t + 1; j++) {
        m[t - 1][j] = num++;
      }
      for (int i = t; i <= n - t + 1; i++) {
        m[i][n - t] = num++;
      }
      if (num < n * n) {
        for (int j = n - t -1 ; j > t - 1; j--) {
          m[n - t][j] = num++;
        }
        for (int i = n - t - 1; i > t; i--) {
          m[i][n - 1] = num++;
        }
        t++;
      }else break;
    }
      for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++)
          System.out.print(m[i][j] + " ");
        System.out.println();
      }

  }
}