import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      long num = scanner.nextLong();
      long max = 0;
      long in;
      while (num != 0) {
        num--;
        in = scanner.nextLong();
        if (in > max && in % 4 == 0) {
          max = in;
        }
      }
      System.out.print(max);
    }
  }
}