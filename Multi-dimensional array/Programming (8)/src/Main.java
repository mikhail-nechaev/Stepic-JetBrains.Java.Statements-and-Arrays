import java.util.*;

public class Main {

  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      int matrixSize = scanner.nextInt();

      int[][] matrix = new int[matrixSize][matrixSize];
      int[] arrayOfNums = new int[matrixSize * matrixSize];

      for (int i = 1; i < matrixSize*matrixSize + 1; i++) {
        arrayOfNums[i - 1] = i;
      }

      int top = 0, bottom = matrixSize - 1;
      int left = 0, right = matrixSize - 1;

      int index = 0;

      while (true) {
        if (left > right) {
          break;
        }

        for (int i = left; i <= right; i++) {
          matrix[top][i] = arrayOfNums[index++];
        }
        top++;

        if (top > bottom) {
          break;
        }

        for (int i = top; i <= bottom; i++) {
          matrix[i][right] = arrayOfNums[index++];
        }
        right--;

        if (left > right) {
          break;
        }

        for (int i = right; i >= left; i--) {
          matrix[bottom][i] = arrayOfNums[index++];
        }
        bottom--;

        if (top > bottom) {
          break;
        }

        for (int i = bottom; i >= top; i--) {
          matrix[i][left] = arrayOfNums[index++];
        }
        left++;
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
