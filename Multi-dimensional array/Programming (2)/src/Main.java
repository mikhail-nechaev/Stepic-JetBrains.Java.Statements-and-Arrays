import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    //put your code here
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int m = scanner.nextInt();
    int[][] array = new int[n][];
    for (int i = 0; i < n; i++) {
      array[i] = new int[m];
      for (int j = 0; j < m; j++) {
        array[i][j] = scanner.nextInt();
      }
    }

    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        System.out.print(array[j][i] + " ");
      }
    }
  }
}