import java.util.*;

public class Main {

  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      int arrayLength = scanner.nextInt();

      int[] array = new int[arrayLength];

      for (int i = 0; i < arrayLength; i++) {
        array[i] = scanner.nextInt();
      }

      int n = scanner.nextInt(), m = scanner.nextInt();
      boolean match = false;

      for (int i = 0; i < arrayLength - 1; i++) {
        if (array[i] == n && array[i + 1] == m || array[i] == m && array[i + 1] == n) {
          match = true;
        }
      }

      System.out.println(match);
    }
  }
}