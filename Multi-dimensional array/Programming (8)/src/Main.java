import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    int n = new Scanner(System.in).nextInt();
    int[][] matrix = new int[n][n];

    int value = 1;
    int minCol = 0;
    int minRow = 0;
    int maxCol = n - 1;
    int maxRow = n - 1;

    while (value <= n * n) {
      for (int i = minCol; i <= maxCol; i++) {
        matrix[minRow][i] = value;
        value++;
      }

      for (int i = minRow + 1; i <= maxRow; i++) {
        matrix[i][maxCol] = value;
        value++;
      }

      for (int i = maxCol - 1; i >= minCol; i--) {
        matrix[maxRow][i] = value;
        value++;
      }

      for (int i = maxRow - 1; i >= minRow + 1; i--) {
        matrix[i][minCol] = value;
        value++;
      }
      minCol++;
      minRow++;
      maxCol--;
      maxRow--;
    }

    for (int[] matrix1 : matrix) {
      for (int j = 0; j < n; j++) {
        System.out.print(matrix1[j] + " ");
      }
      System.out.println();
    }
  }
}