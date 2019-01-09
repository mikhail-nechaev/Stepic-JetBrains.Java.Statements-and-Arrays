import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int dim = sc.nextInt();
    int[][] pre = new int[dim][dim];
    int current = 1;
    for (int i = 0; i < dim; i++) {
      for (int j = 0; j < dim; j++) {
        pre[i][j] = current;
        current++;
      }
    }
    int line_step = 1;
    int t = 0;
    int b = dim - 1;
    int l = 0;
    int r = dim - 1;
    int dir = 0;
    int[][] res = new int[dim][dim];
    int cell = 1;
    while (cell <= dim*dim) {
      if (dir==0) {
        for (int j = l; j <= r; j++) {
          res[t][j] = cell;
          cell++;
        }
        t++;
      }
      else if (dir==1)
      {
        for (int i = t; i<=b; i++) {
          res[i][r] = cell;
          cell++;
        }
        r--;
      }
      else if (dir ==2){
        for (int j=r; j>=l; j--) {
          res[b][j] = cell;
          cell++;
        }
        b--;
      }
      else if (dir==3) {
        for (int i=b; i>=t; i--) {
          res[i][l] = cell;
          cell++;
        }
        l++;
      }
      dir = (dir+1)%4;
    }
    for (int i = 0; i < dim; i++) {
      for (int j = 0; j < dim; j++) {
        System.out.print(res[i][j]+" ");
      }
      System.out.println();
    }
  }
}