import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int[][] arr = new int[n][n];
    int x = 0, y = 0, dx = 1, dy = 0;
    int d = 0,tmp, size = n-1;
    for (int i = 1; i <= n*n; i++) {
      if (size == 0) { tmp = dx;dx = -dy;dy = tmp;size = n*(d%2)+n*((d+1)%2)-d/2-1;d++; }
      arr[y][x] = i;
      x=x+dx;y=y+dy; size--;
    }
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) System.out.print(arr[i][j]+" ");
      System.out.println();
    }
  }
}