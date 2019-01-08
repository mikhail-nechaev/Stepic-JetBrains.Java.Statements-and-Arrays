import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int rows = sc.nextInt();
    int columns = sc.nextInt();
    int [][] arr= new int[rows][columns];
    for (int i=0; i<rows; i++)
      for (int j=0; j<columns; j++)
        arr[i][j] = sc.nextInt();
    for (int i = 0; i<columns; i++) {
      for (int j = rows-1; j>=0; j--) {
        System.out.print(arr[j][i] + " ");
      }
      System.out.println();
    }
  }
}