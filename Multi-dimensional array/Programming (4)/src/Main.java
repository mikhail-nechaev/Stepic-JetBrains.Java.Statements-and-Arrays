import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int x = scanner.nextInt();
    int y = scanner.nextInt();
    int[][] m = new int[x][y];

    for (int i = 0; i < x; i++)
      for (int j = 0; j < y; j++)
        m[i][j] = scanner.nextInt();

    for (int i = 0; i < y; i++) {
      for (int j = x - 1; j >= 0; j--)
        System.out.print(m[j][i] + " ");
      System.out.println();
    }
  }
}