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

    int seats = sc.nextInt();
    int count = 0;

    for (int i = 0; i < a; i++) {
      for (int j = 0; j < b; j++) {
        if (arr[i][j] == 0){
          count++;
        } else {
          count = 0;
        }
        if (count == seats){
          System.out.println(i + 1);
          return;
        }
      }
      count = 0;
    }

    System.out.println("0");

  }
}