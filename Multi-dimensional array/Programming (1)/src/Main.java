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

      int index1 = 0, index2 = 0;
      int max = matrix[0][0];

      for (int k = 0; k < rows; k++) {
        for (int l = 0; l < columns; l++) {
          if (matrix[k][l] > max) {
            max = matrix[k][l];
            index1 = k;
            index2 = l;
          }
        }
      }

      System.out.println(index1 + " " + index2);
    }
  }
}