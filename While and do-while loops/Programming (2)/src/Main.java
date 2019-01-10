import java.util.*;

public class Main {

  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      int number = 100;
      int sum = 0;

      while (number != 0) {
        number = scanner.nextInt();
        sum += number;
      }

      System.out.println(sum);
    }
  }
}