import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int length = scanner.nextInt();
    int prev = scanner.nextInt();
    int max = 0;
    if (length == 1) {
      System.out.println(prev);
    } else {
      for (int i = 1; i < length; i++) {
        int curr = scanner.nextInt();
        if (curr * prev > max) {
          max = curr * prev;
        }
        prev = curr;
      }
      System.out.println(max);
    }
  }
}