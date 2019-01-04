import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int max = 0;
    int next;

    while (scanner.hasNext()) {
      next = scanner.nextInt();
      if (next % 4 == 0) {
        max = Math.max(next, max);
      }
    }

    System.out.println(max);

  }
}