import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    char[][] array = new char[n][];
    for (int i = 0; i < n; i++) {
      array[i] = new char[n];
      for (int j = 0; j < n; j++) {
        if ((i == j) || i == n / 2 || j == n / 2 || i + j + 1 == n) {
          array[i][j] = '*';
        } else {
          array[i][j] = '.';
        }
      }
    }

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        System.out.print(array[i][j] + " ");
      }
      System.out.println();
    }
  }

}