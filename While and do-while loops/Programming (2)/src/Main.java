import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int sum = 0;
    int next;

    while (scanner.hasNext()) {
      next = scanner.nextInt();
      if (next == 0) {
        break;
      }
      sum += next;
    }

    System.out.println(sum);
  }
}