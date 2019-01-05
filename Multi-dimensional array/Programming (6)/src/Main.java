import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    int size = scanner.nextInt();
    scanner.close();

    String arr[][] = new String[size][size];

    for (int i = 0; i < size; i++) {
      for (int j = 0; j < size; j++) {
        if ((i == j) || (i == ((size) / 2)) || (j == ((size) / 2)) || (i == size - j - 1)) {
          arr[i][j] = "*";
        } else {
          arr[i][j] = ".";
        }
      }
    }

    for (int i = 0; i < size; i++) {
      for (int j = 0; j < size; j++) {
        System.out.print(arr[i][j] + " ");
      }
      System.out.println();
    }

  }

}