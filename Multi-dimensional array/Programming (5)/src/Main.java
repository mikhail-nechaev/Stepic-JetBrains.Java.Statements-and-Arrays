import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int row = scanner.nextInt();
    int col = scanner.nextInt();
    int[][] matrix = new int[row][col];
    int temp;

    for (int i = 0; i < row; i++)
      for (int j = 0; j < col; j++)
        matrix[i][j] = scanner.nextInt();

    int a = scanner.nextInt();
    int b = scanner.nextInt();

    for (int i = 0;i< row; i++){
      temp = matrix[i][a];
      matrix[i][a] = matrix[i][b];
      matrix[i][b] = temp;
    }

    for (int i = 0; i < row; i++) {
      for (int j = 0; j < col; j++)
        System.out.print(matrix[i][j] + " ");
      System.out.println();
    }
  }
}