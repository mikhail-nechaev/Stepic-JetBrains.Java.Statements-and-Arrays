import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    for (int i = 0; i < n; i++) {
      for (int j = i; j > 0 ; j--) {
        System.out.print(j + " ");
      }
      for (int j = 0; j < n - i; j++) {
        System.out.print(j + " ");
      }
      System.out.println();
    }
  }
}