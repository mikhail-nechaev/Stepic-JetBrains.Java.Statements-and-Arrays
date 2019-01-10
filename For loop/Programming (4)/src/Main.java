import java.util.*;

public class Main {

  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      int start = scanner.nextInt();
      int end = scanner.nextInt();
      int counter = 0;
      int sum = 0;

      for (int i = start; i <= end; i++) {
        if (i % 3 == 0) {
          sum += i;
          counter++;
        }
      }

      System.out.println((double)sum / counter);
    }
  }
}