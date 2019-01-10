import java.util.*;

public class Main {

  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      int numOfNumbers = scanner.nextInt();
      int sum = 0;

      for (int i = 0; i < numOfNumbers; i++) {
        int element = scanner.nextInt();

        if (element % 6 == 0) sum += element;
      }

      System.out.println(sum);
    }
  }
}