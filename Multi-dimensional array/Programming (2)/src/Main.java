import java.util.Scanner;

@SuppressWarnings("Duplicates")
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

    for (int i = 0; i < b; i++) {
      for (int j = 0; j < a; j++) {
        System.out.print(arr[j][i] + " ");
      }
    }

  }
}