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
    int max = Integer.MIN_VALUE;
    int r_m = 0;
    int c_m = 0;
    for (int i=0; i< rows; i++)
      for (int j=0; j<columns; j++) {
        if (arr[i][j]>max) {
          max = arr[i][j];
          r_m = i;
          c_m = j;
        }
      }
    System.out.print(r_m+ " "+c_m);
  }
}