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
    int[][] newArray = new int[m][];
    for (int i = 0; i < m; i++) {
      newArray[i] = new int[n];
    }

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        newArray[j][i] = array[i][j];
      }
    }

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        System.out.print(newArray[i][j] + " ");
      }
    }
  }
}