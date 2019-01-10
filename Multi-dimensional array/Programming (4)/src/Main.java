import java.util.*;

public class Main {

  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      int rows = scanner.nextInt();
      int columns = scanner.nextInt();
      int[][] matrix = new int[rows][columns];
      int[][] answers = new int[columns][rows];

      for (int i = 0; i < rows; i++) {
        for (int j = 0; j < columns; j++) {
          matrix[i][j] = scanner.nextInt();
        }
      }

      int rotate = rows - 1;
      for (int i = 0; i < rows; i++) {
        for (int j = 0; j < columns; j++) {
          answers[j][rotate] = matrix[i][j];
        }
        rotate--;
      }

      for (int i = 0; i < columns; i++){
        for (int j = 0; j < rows; j++) {
          System.out.print(answers[i][j] + " ");
        }
        System.out.println();
      }
    }
  }
}