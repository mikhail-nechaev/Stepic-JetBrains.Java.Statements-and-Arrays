import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    int size = scanner.nextInt();
    int[][] tbl = new int[size][size];
    int x = 0;
    int y = size - 1;
    int ctr = 1;

    while (ctr <= size * size) {
      for (int i = 0; i < tbl.length; i++) {
        if (tbl[x][i] == 0) {
          tbl[x][i] = ctr++;
        }
      }

      for (int i = 0; i < tbl.length; i++) {
        if (tbl[i][y] == 0) {
          tbl[i][y] = ctr++;
        }
      }

      for (int i = tbl.length - 1; i >= 0; i--) {
        if (tbl[y][i] == 0) {
          tbl[y][i] = ctr++;
        }
      }

      for (int i = tbl.length - 1; i >= 0; i--) {
        if (tbl[i][x] == 0) {
          tbl[i][x] = ctr++;
        }
      }

      x++;
      y--;
    }

    for (int i = 0; i < tbl.length; i++) {
      for (int j = 0; j < tbl.length; j++) {
        System.out.print(tbl[i][j] + " ");
      }
      System.out.println();
    }

  }
}