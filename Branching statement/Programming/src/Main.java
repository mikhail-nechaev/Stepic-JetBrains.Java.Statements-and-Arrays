import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      while (true) {
        int num = scanner.nextInt();
        if (num == 0) {
          break;
        }
        if (num % 2 == 0) {
          System.out.println("even");
        } else if (num % 2 == 1) {
          System.out.println("odd");
        }
      }
    }
  }
}