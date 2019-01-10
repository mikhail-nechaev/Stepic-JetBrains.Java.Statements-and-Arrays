import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int[][] arr = new int[n][n];
    for (int i = 0; i < n; i++){
      for (int j = 0; j < n; j++){
        arr[i][j] = in.nextInt();
      }
    }
    boolean flag=true;
    for (int i = 0; i < n; i++) {
      for (int k = i; k < n; k++) if (arr[i][k] != arr[k][i]) flag=false;
    }
    System.out.println(flag? "YES" : "NO");
  }
}