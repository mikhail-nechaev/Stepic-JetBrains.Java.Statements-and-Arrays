import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      int count = scanner.nextInt();
      int sum = 0;
      for (int i = 0; i < count; i++) {
        int in = scanner.nextInt();
        if (in % 6 == 0) {
          sum += in;
        }
      }
      System.out.print(sum);
    }
  }
}