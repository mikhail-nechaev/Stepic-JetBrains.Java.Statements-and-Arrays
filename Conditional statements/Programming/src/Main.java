import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      int num = scanner.nextInt();
      if ((num > 0)) {
        System.out.print("YES");
      } else {
        System.out.print("NO");
      }
    }
  }
}