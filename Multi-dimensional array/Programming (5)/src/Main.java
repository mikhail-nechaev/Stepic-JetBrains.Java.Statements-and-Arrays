import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int rows = sc.nextInt();
    int columns = sc.nextInt();
    int[][] arr = new int[rows][columns];
    for (int i=0; i< rows; i++)
      for (int j=0; j<columns; j++)
        arr[i][j] = sc.nextInt();
    int c1 = sc.nextInt();
    int c2 = sc.nextInt();
    for (int i = 0; i < rows; i++) {
      int temp = arr[i][c2];
      arr[i][c2] = arr[i][c1];
      arr[i][c1] = temp;
    }
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < columns; j++) {
        System.out.print(arr[i][j]+" ");
      }
      System.out.println();
    }
  }
}