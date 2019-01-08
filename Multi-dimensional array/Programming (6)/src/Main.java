import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int dim = sc.nextInt();
    char[][] arr = new char[dim][dim];
    for (int i=0; i< dim; i++)
      for (int j=0; j<dim; j++) {
        if ((i == dim / 2) || (j == dim / 2)|| (i==j)|| (i==dim-j-1))
          arr[i][j] = '*';
        else
          arr[i][j] = '.';
      }
    for (int i = 0; i < dim; i++) {
      for (int j = 0; j < dim; j++) {
        System.out.print(arr[i][j]+" ");
      }
      System.out.println();
    }
  }
}