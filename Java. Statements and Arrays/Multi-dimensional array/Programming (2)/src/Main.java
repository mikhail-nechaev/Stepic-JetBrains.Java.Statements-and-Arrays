import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int m = in.nextInt();
    int[][] arr1 = new int[n][m];
    int[][] arr2 = new int[m][n];
    for (int i = 0; i < n; i++){
      for (int j = 0; j < m; j++) {
        arr1[i][j] = in.nextInt();
        arr2[j][i] = arr1[i][j];
      }

    }
    for (int i = 0; i < m; i++){
      for (int j = 0; j < n; j++) System.out.print(arr2[i][j]+" ");
    }

  }
}