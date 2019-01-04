import java.util.Collections;
import java.util.Scanner;

@SuppressWarnings("ALL")
public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int[][] arr = new int[a][b];
    for (int i = 0; i < a; i++) {
      for (int j = 0; j < b; j++) {
        arr[i][j] = sc.nextInt();
      }
    }

    int sw1 = sc.nextInt();
    int sw2 = sc.nextInt();

  }
}