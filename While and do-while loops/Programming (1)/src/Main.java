import java.util.*;

public class Main {

  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      int numOfNumbers = scanner.nextInt();
      int maxElement = 0;
      while (numOfNumbers-- > 0) {
        int number = scanner.nextInt();
        if (number > maxElement && number % 4 == 0) {
          maxElement = number;
        }
      }

      System.out.println(maxElement);
    }
  }
}