import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    boolean flag = false;
    int curr;
    for (int i = 0; i < n; i++) {
      curr = i;
      for (int j = 0; j < n; j++) {
        if (flag) {
          System.out.print(curr + " ");
          curr--;
          if (curr == 0) {
            flag = false;
          }
        } else {
          System.out.print(curr + " ");
          curr++;
        }
      }
      System.out.println();
      flag = true;
    }

  }
}