import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      int a = scanner.nextInt();
      int b = scanner.nextInt();
      int sum = 0;
      int count = 0;
      for (int i = a; i <= b; i++) {
        if (i % 3 == 0) {
          sum += i;
          count ++;
        }
      }
      System.out.print((double)sum/count);
    }
  }
}