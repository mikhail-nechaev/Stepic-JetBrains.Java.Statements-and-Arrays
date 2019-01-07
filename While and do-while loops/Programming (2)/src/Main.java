import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      int in = scanner.nextInt();
      int sum = 0;
      while (in != 0) {
        sum += in;
        in = scanner.nextInt();
      }
      System.out.print(sum);
    }
  }
}