import java.util.*;

public class Main {

  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      int rows = scanner.nextInt();
      int columns = scanner.nextInt();
      int[][] matrix = new int[rows][columns];

      for (int i = 0; i < rows; i++) {
        for (int j = 0; j < columns; j++) {
          matrix[i][j] = scanner.nextInt();
        }
      }

      int[][] answer = new int[columns][rows];

      for (int i = 0; i < columns; i++) {
        for (int j = 0; j < rows; j++) {
          answer[i][j] = matrix[j][i];
        }
      }

      for (int i = 0; i < columns; i++) {
        for (int j = 0; j < rows; j++) {
          System.out.print(answer[i][j] + " ");
        }
      }

    }
  }
}