import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int m = in.nextInt();
    int[][] arr = new int[n][m];
    for (int i = 0; i < n; i++)
      for (int j = 0; j < m; j++)
        arr[i][j]= in.nextInt();
    int k = in.nextInt();
    int b=0;
    boolean flag = false;
    for (int i = 0; i < n; i++)
    {
      if(flag)
        break;
      int l=0;
      for (int j = 0; j < m; j++) {
        if (arr[i][j] == 0) l++; else l = 0;
        if (l == k) {
          b=i+1;
          flag = true;
          break;
        }
      }
    }
    System.out.println(b);
  }
}