import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int m = in.nextInt();
    int[][] arr = new int[n][m];
    for (int i = 0; i < n; i++)
      for (int j = 0; j < m; j++)
        arr[i][j] = in.nextInt();
    int p = in.nextInt();
    int d = in.nextInt();
    for (int i = 0; i < n; i++) {
      int tmp = arr[i][p];
      arr[i][p] = arr[i][d];
      arr[i][d] = tmp;
    }
    for (int i = 0; i < n; i++){
      for (int k = 0; k < m; k++) System.out.print(arr[i][k]+" ");
      System.out.println();
    }
  }
}