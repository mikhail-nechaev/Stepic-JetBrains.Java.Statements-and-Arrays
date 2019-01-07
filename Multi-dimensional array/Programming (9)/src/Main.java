import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      StringBuilder str = new StringBuilder();
      while (scanner.hasNextLine()) {
        String in = scanner.nextLine();
        if (!in.equals("end")) {
          str.append(in).append("\n");
        } else {
          break;
        }
      }
      String[] arr = str.toString().split("\n");
      int[][] matrix = new int[arr.length][];
      for (int i = 0; i < matrix.length; i++) {
        String[] s = arr[i].split(" ");
        matrix[i] = new int[s.length];
        for (int j = 0; j < matrix[i].length; j++) {
          matrix[i][j] = Integer.parseInt(s[j]);
        }
      }

      int[][] nmatrix = new int[matrix.length][matrix[0].length];
      for (int i = 0; i < matrix.length; i++) {
        for (int j = 0; j < matrix[0].length; j++) {
          int right = matrix[(i + 1) % matrix.length][j];
          int left = matrix[(i - 1 < 0) ? matrix.length - 1 : (i - 1)][j];
          int up = matrix[i][(j + 1) % matrix[0].length];
          int down = matrix[i][(j - 1 < 0) ? matrix[0].length - 1 : (j - 1)];
          nmatrix[i][j] = right + left + up + down;
        }
      }
      for (int i = 0; i < matrix.length; i++) {
        for (int j = 0; j < matrix[i].length; j++) {
          System.out.print(nmatrix[i][j] + " ");
        }
        System.out.println();
      }
    }
  }
}