import java.util.*;

public class Main {

  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      int n = scanner.nextInt();
      int m = scanner.nextInt();
      int numOfSegments = scanner.nextInt();

      if (n * m < numOfSegments) {
        System.out.println("NO");
      } else if (numOfSegments % n == 0 || numOfSegments % m == 0) {
        System.out.println("YES");
      } else {
        System.out.println("NO");
      }
    }
  }
}