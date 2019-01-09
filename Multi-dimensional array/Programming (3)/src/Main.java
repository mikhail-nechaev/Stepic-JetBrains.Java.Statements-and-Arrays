import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int[][] m = new int[n][n];
    int a;

    for (int i = 0; i < n; i++) {
      a = i;
      for (int j = 0; j < n; j++) {
        if (i == j) a = 0;
        m[i][j] = a;

        if (i > j) a--;
        else
          a++;
      }
    }
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        System.out.print(m[i][j] + " ");
      }
      System.out.println();
    }
  }
}