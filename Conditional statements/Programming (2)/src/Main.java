import java.util.*;

public class Main {

  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      int number = scanner.nextInt();

      if (number > -15 && number <= 12) {
        System.out.println("True");
      } else if (number > 14 && number < 17) {
        System.out.println("True");
      } else if (number >= 19) {
        System.out.println("True");
      } else {
        System.out.println("False");
      }
    }
  }
}