import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      int a = scanner.nextInt();
      int b = scanner.nextInt();
      int c = scanner.nextInt();
      if (a >= b + c) {
        System.out.print("NO");
      } else if (b >= c + a) {
        System.out.print("NO");
      } else if (c >= b + a) {
        System.out.print("NO");
      } else {
        System.out.print("YES");
      }
    }
  }
}