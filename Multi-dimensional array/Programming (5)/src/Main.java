import java.util.*;

public class Main {

  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      int rows = scanner.nextInt();
      int columns = scanner.nextInt();
      int[][] matrix = new int[rows][columns];
      int save = 0;

      for (int i = 0; i < rows; i++) {
        for (int j = 0; j < columns; j++) {
          matrix[i][j] = scanner.nextInt();
        }
      }

      int column1 = scanner.nextInt();
      int column2 = scanner.nextInt();

      for (int i = 0; i < rows; i++) {
        save = matrix[i][column1];
        matrix[i][column1] = matrix[i][column2];
        matrix[i][column2] = save;
      }

      for (int i = 0; i < rows; i++) {
        for (int j = 0; j < columns; j++) {
          System.out.print(matrix[i][j] + " ");
        }
        System.out.println();
      }

    }
  }
}