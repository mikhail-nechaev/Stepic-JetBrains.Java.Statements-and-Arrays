import java.util.*;

public class Main {

  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      int arrayLength = scanner.nextInt();
      int[] array = new int[arrayLength];

      for (int i = 0; i < arrayLength; i++) {
        array[i] = scanner.nextInt();
      }

      int max = 0;

      if (arrayLength == 1) {
        System.out.println(array[0]);
      } else {
        for (int j = 0; j < arrayLength; j++) {
          int a = array[j];
          for (int k = 0; k < arrayLength; k++) {
            if (k == j) continue;
            int b = array[k];
            if (a > 0 && b > 0 && a * b > max) {
              max = a * b;
            }
          }
        }
        System.out.println(max);
      }
    }
  }
}