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
    int [][] trarr = new int[columns][rows];
    for (int i=0; i<rows; i++)
      for (int j=0; j<columns; j++)
        trarr[j][i] = arr[i][j];
    for (int i=0; i<columns; i++)
      for (int j=0; j<rows; j++)
        System.out.print(trarr[i][j]+" ");
  }
}