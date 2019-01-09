import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int[][] array = new int[n][];
    for (int i = 0; i < n; i++) {
      array[i] = new int[n];
      for (int j = 0; j < n; j++) {
        array[i][j] = scanner.nextInt();
      }
    }
    String answer = "YES";
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        if (array[i][j] != array[j][i]) {
          answer = "NO";
          break;
        }
      }
    }
    System.out.println(answer);
  }
}