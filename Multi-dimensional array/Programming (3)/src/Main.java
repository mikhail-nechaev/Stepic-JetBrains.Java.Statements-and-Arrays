import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int dim = sc.nextInt();
    int [][] arr= new int[dim][dim];
    for (int i=0; i<dim; i++) {
      for (int j = 0; j < dim; j++) {
        System.out.print(Math.abs(i - j) + " ");
      }
      System.out.println();
    }
  }
}