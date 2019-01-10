import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    //put your code here
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int m = scanner.nextInt();
    int[][] matrix = new int[n][];
    for (int i = 0; i < n; i++) {
      matrix[i] = new int[m];
      for (int j = 0; j < m; j++) {
        matrix[i][j] = scanner.nextInt();
      }
    }
    int k = scanner.nextInt();

    StringBuilder stringBuilder = new StringBuilder();
    for (int i = 0; i < k; i++) {
      stringBuilder.append("0");
    }
    String pattern = stringBuilder.toString();

    String[] arr = new String[n];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        arr[i]+=matrix[i][j];
      }
    }

    int answer = 0;
    for (int i = 0; i < n; i++) {
      if (arr[i].contains(pattern)) {
        answer = i + 1;
        break;
      }
    }
    System.out.println(answer);
  }
}