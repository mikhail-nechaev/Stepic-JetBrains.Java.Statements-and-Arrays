import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    char[][] arr = new char[n][n];
    for (int i = 0; i < n; i++)
      for (int j = 0; j < n; j++)
        arr[i][j]='.';
    for (int i = 0; i < n; i++)
      for (int j = 0; j < n; j++){
      if (i==j) {arr[i][j] = '*'; arr[i][Math.abs(i-n+1)] = '*';}
      else if (i == Math.abs(n-1-i)) arr[i][j] = '*';
      else if (j == Math.abs(n-1-j)) arr[i][j] = '*';
    }

    for (int i = 0; i < n; i++){
      for (int k = 0; k < n; k++) System.out.print(arr[i][k]+" ");
      System.out.println();
    }
  }
}