import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int dim = sc.nextInt();
    int [][] arr= new int[dim][dim];
    for (int i=0; i<dim; i++)
      for (int j=0; j<dim; j++)
        arr[i][j] = sc.nextInt();
    boolean flag = true;
    for (int i=0; i<dim; i++) {
      for (int j = 1; j<dim; j++) {
        if (arr[i][j]!=arr[j][i]){
          flag = false;
          break;
        }
      }
    }
  if (flag == false)
    System.out.println("NO");
  else
    System.out.println("YES");
  }
}