import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      int count = scanner.nextInt();
      long max = 0;
      for (int i = 0; i < count; i++) {
        long in = scanner.nextLong();
        if (in % 4 == 0 && in > max) {
          max = in;
        }
      }
      System.out.print(max);
    }
  }
}