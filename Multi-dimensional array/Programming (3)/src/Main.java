import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int[][] m = new int[n][n];
    int a = 0;

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        if (a == n) a = 0;
        m[i][j] = a;
        a++;
        System.out.print(m[i][j] + " ");
      }
      System.out.println();
    }
  }
}