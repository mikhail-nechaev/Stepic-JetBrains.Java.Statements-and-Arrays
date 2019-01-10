import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String str = in.nextLine();
    if (str.equals("end"))
      return;
    String[] split = str.split(" ");
    int n = split.length;
    int[][] arr = new int[1000][n];
    for (int i = 0; i < n; i++)
      arr[0][i] = Integer.parseInt(split[i]);
    int count = 1;
    while (true) {
      str = in.nextLine();
      if (str.equals("end"))
        break;
      split = str.split(" ");
      for (int i = 0; i < n; i++)
        arr[count][i] = Integer.parseInt(split[i]);
      count++;
    }
    for (int i = 0; i < count; i++) {
      for (int j = 0; j < n; j++) {
        int neI = i - 1;
        if (neI < 0)
          neI = count - 1;
        int neIJ = i + 1;
        if (neIJ > count - 1)
          neIJ = 0;
        int neJI = j - 1;
        if (neJI < 0)
          neJI = n - 1;
        int neJJ = j + 1;
        if (neJJ > n - 1)
          neJJ = 0;
        int arrTmp = (arr[neI][j] + arr[neIJ][j] + arr[i][neJI] + arr[i][neJJ]);
        System.out.print(arrTmp);
        if (j != n - 1) System.out.print(" ");
      }
      System.out.println();
    }
  }
}