import java.util.*;

public class Main {

  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      int arrayLength = scanner.nextInt();
      int[] array = new int[arrayLength];

      for (int i = 0; i < arrayLength; i++) {
        array[i] = scanner.nextInt();
      }

      int max = array[0];
      int index = 0;

      for (int j = 1; j < arrayLength; j++) {
        if (array[j] > max) {
          index = j;
          max = array[j];
        }
      }

      System.out.println(index);
    }
  }
}