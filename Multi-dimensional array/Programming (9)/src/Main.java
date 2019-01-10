import java.util.*;

public class Main {

  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      String momentString = scanner.nextLine();
      StringBuilder inputString = new StringBuilder();
      String[] inputMatrix;
      int[][] matrix;

      while (!momentString.equals("end")) {
        inputString.append(momentString );
        inputString.append("\n");
        momentString = scanner.nextLine();
      }

      inputMatrix = inputString.toString().split("\n");
      matrix = new int[inputMatrix.length][];

      int rows = inputMatrix.length;
      int columns = 0;

      for (int i = 0; i < rows; i++) {
        String[] numbers = inputMatrix[i].split(" ");
        columns = numbers.length;
        matrix[i] = new int[columns];
        for (int j = 0; j < columns; j++) {
          matrix[i][j] = Integer.valueOf(numbers[j]);
        }
      }

      int[][] answers = new int[rows][columns];
      int leftI, rightI, leftJ, rightJ;

      for (int i = 0; i < rows; i++) {
        for (int j = 0; j < columns; j++) {
          if (i - 1 < 0) {
            leftI = matrix[rows - 1][j];
          } else {
            leftI = matrix[i - 1][j];
          }

          rightI = matrix[(i + 1) % rows][j];

          if (j - 1 < 0) {
            leftJ = matrix[i][columns - 1];
          } else {
            leftJ = matrix[i][j - 1];
          }

          rightJ = matrix[i][(j + 1) % columns];

          answers[i][j] = leftI + rightI + leftJ + rightJ;
        }
      }

      for (int i = 0; i < rows; i++) {
        for (int j = 0; j < columns; j++) {
          System.out.print(answers[i][j] + " ");
        }
        System.out.println();
      }
    }
  }
}