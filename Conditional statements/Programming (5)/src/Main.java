import java.util.*;

public class Main {

  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      int x_1 = scanner.nextInt();
      int y_1 = scanner.nextInt();
      int x_2 = scanner.nextInt();
      int y_2 = scanner.nextInt();

      if (x_1 == x_2 || y_1 == y_2 || Math.abs(x_1 - x_2) == Math.abs(y_1 - y_2)) {
        System.out.println("YES");
      } else {
        System.out.println("NO");
      }
    }
  }
}