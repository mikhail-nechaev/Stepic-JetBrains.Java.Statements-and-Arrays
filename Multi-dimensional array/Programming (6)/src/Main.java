import java.util.*;

public class Main {

  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      int matrixSize = scanner.nextInt();

      char[][] matrix = new char[matrixSize][matrixSize];

      for (int i = 0; i < matrixSize; i++) {
        for (int j = 0; j < matrixSize; j++) {
          matrix[i][j] = '.';
        }
      }

      for (int i = 0; i < matrixSize; i++) {
        for (int j = 0; j < matrixSize; j++) {
          if (i == j ) {
            matrix[i][j] = '*';
            matrix[i][Math.abs(i - matrixSize + 1)] = '*';
          } else if (i == Math.abs(matrixSize - 1 - i)) {
            matrix[i][j] = '*';
          } else if (j == Math.abs(matrixSize - 1 - j)) {
            matrix[i][j] = '*';
          }
        }
      }

      for (int i = 0; i < matrixSize; i++) {
        for (int j = 0; j < matrixSize; j++) {
          System.out.print(matrix[i][j] + " ");
        }
        System.out.println();
      }
    }
  }
}