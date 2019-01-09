import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    List<int[]> list = new ArrayList();

    String row = scanner.nextLine();
    while (!row.equals("end")) {
      int[] rowArr = Arrays.stream(row.split(" ")).mapToInt(Integer::parseInt).toArray();
      list.add(rowArr);
      row = scanner.nextLine();
    }

    int[][] array = new int[list.size()][];
    for (int i = 0; i < list.size(); i++) {
      array[i] = list.get(i);
    }

    int[][] resultArr = new int[array.length][array[0].length];

    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array[0].length; j++) {
        int first = array[(i + 1) % array.length][j];
        int second = array[(i - 1 < 0) ? array.length - 1 : (i - 1)][j];
        int third = array[i][(j + 1) % array[0].length];
        int fourth = array[i][(j - 1 < 0) ? array[0].length - 1 : (j - 1)];
        resultArr[i][j] = first + second + third + fourth;
      }
    }

    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array[0].length; j++)
        System.out.print(resultArr[i][j] + " ");
      System.out.println();
    }
  }
}