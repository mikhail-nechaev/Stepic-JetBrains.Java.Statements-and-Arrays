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
    int order = sc.nextInt();
    int offer = 0;
    boolean flag = false;
    for (int i=0; i< rows; i++){
      int row_counter = 0;
      for (int j=0; j<columns; j++) {
        if (arr[i][j] == 0) {
          row_counter++;
          if (row_counter == order) {
            offer = ++i;
            flag = true;
            break;
          }
        }
        else {
          row_counter = 0;
        }
      }
      if (flag==true) {
        break;
      }
      }
    System.out.println(offer);
  }
}