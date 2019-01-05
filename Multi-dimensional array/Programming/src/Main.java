import java.util.*;

public class Main {

  public static void main(String[] args) {
    //put your code here
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();

    int[][] matrix = new int[n][n];
    int[][] trans = new int[n][n];

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        matrix[i][j] = scanner.nextInt();
      }
    }

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        trans[j][i] = matrix[i][j];
      }
    }

    boolean isSymetric = true;
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        if (matrix[i][j] != trans[i][j]) {
          isSymetric = false;
          break;
        }
      }
    }
    if (isSymetric) {
      System.out.println("YES");
    } else {
      System.out.println("NO");
    }

  }

}
