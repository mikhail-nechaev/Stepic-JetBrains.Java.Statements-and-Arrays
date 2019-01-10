import java.util.*;

public class Main {

  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      int matrixSize = scanner.nextInt();
      int[][] matrix = new int[matrixSize][matrixSize];

      for (int i = 0; i < matrixSize; i++) {
        for (int j = 0; j < matrixSize; j++) {
          matrix[i][j] = scanner.nextInt();
        }
      }

      boolean answer = true;
      for (int k = 0; k < matrixSize; k++) {
        for (int l = k; l < matrixSize; l++) {
          if (matrix[k][l] != matrix[l][k]) answer = false;
        }
      }

      if (answer) {
        System.out.println("YES");
      } else {
        System.out.println("NO");
      }
    }
  }
}