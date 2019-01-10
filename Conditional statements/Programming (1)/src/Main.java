import java.util.*;

public class Main {

  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      int a, b, c;
      a = scanner.nextInt();
      b = scanner.nextInt();
      c = scanner.nextInt();

      if (a + b > c) {
        if (a + c > b) {
          if (c + b > a) {
            System.out.println("YES");
          } else System.out.println("NO");
        } else System.out.println("NO");
      } else System.out.println("NO");


    }
  }
}