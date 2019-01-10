import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int m = in.nextInt();
    int[][] arr = new int[n][m];
    for (int i = 0; i < n; i++){
      for (int k = 0; k < m; k++) arr[i][k] = in.nextInt();
    }
    int max=arr[0][0], arrn =0, arrm =0;
    for (int i = 0; i < n; i++) {
      for (int k = 0; k < m; k++) {
        if (arr[i][k] > max){
          max = arr[i][k];
          arrn =i; arrm =k;
        }
      }
    }
    System.out.println(arrn+" "+arrm);
  }
}