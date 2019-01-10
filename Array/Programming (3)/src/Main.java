import java.util.*;

public class Main {

  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      int arrayLength = scanner.nextInt();
      int[] array = new int[arrayLength];

      for (int i = 1; i < arrayLength; i++) {
        array[i] = scanner.nextInt();
      }

      array[0] = scanner.nextInt();

      for (int element : array) {
        System.out.print(element + " ");
      }
    }
  }
}