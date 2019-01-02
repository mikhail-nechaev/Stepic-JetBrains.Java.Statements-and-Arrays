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

    for (int i = 0; i < x; i++) {
      for (int j = i + 1; j < y; j++) {
        int temp = m[i][j];
        m[i][j] = m[j][i];
        m[j][i] = temp;
      }
    }
    for (int i = 0; i< x ; i++ )
      for (int j = 0 ; j< y ; j++)
        System.out.print(m[i][j] + " ");
  }

}