import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int max = 0;
    int length = scanner.nextInt();
    for (int i = 0; i < length; i++) {
      int next = scanner.nextInt();
      if (next > max && next % 4 == 0) {
        max = next;
      }
    }
    System.out.println(max);
  }
}