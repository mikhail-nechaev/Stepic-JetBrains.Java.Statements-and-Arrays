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
    int k = scanner.nextInt();
    int f = k;
    for (int i = 0; i < x; i++) {
      for (int j = 0; j < y; j++) {
        if (m[i][j] == 0)
          f--;
        if (f == 0) {
          f = x;
          break;
        }
        if (m[i][j] == 1) f = k;
      }
    }
    System.out.println(f);
  }
}