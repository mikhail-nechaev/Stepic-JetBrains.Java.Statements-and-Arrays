import java.util.*;

public class Main {

  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      int start = scanner.nextInt();
      int end = scanner.nextInt();
      int sum = 0;

      for (int i = start; i <= end ; i++) {
        sum += i;
      }

      System.out.println(sum);
    }
  }
}