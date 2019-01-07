import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      int in = scanner.nextInt();
      int count = 0;
      while (in != 0) {
        in = scanner.nextInt();
        count++;
      }
      System.out.print(count);
    }
  }
}