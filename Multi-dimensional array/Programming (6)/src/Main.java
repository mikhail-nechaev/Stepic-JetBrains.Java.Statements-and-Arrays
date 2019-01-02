import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    String[][] m = new String[n][n];
    int midle = n / 2;

    for (int i = 0; i < n; i++)
      for (int j = 0; j < n; j++)
        m[i][j] = ".";

    int c = 0;
    int e = n - 1;
    for (int i = 0; i < n; i++) {
      m[midle][i] = "*";
      m[i][midle] = "*";
      m[c][c] = "*";
      m[e][c] = "*";
      c++;
      e--;
    }

    for (String[] strings : m) {
      for (int j = 0; j < m[0].length; j++)
        System.out.print(strings[j] + " ");
      System.out.println();
    }
  }
}