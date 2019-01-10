import java.util.*;

public class Main {

  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      int numOfNumbers = scanner.nextInt();
      int max = 0;

      for (int i = 0; i < numOfNumbers; i++) {
        int element = scanner.nextInt();

        if (element % 4 == 0 && element > max) max = element;
      }

      System.out.println(max);
    }
  }
}