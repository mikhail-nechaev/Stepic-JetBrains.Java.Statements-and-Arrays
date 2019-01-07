import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      long m = scanner.nextLong();
      long n = 1;
      while (fact(n) <= m) {
        n++;
      }
      System.out.print(n);
    }
  }

  private static long fact(long n) {
    long result = 1;
    for (int fact = 2; fact <= n; fact++) {
      result *= fact;
    }
    return result;
  }
}