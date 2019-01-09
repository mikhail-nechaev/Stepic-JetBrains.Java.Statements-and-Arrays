import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int amount = scanner.nextInt();
    int sum = 0;
    int next;
    for (int i = 0; i < amount; i++) {
      next = scanner.nextInt();
      if (next % 6 == 0) {
        sum+=next;
      }
    }
    System.out.println(sum);
  }
}