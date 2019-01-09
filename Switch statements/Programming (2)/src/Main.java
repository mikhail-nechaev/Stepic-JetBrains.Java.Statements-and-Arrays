import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    long x = scanner.nextLong();
    String op = scanner.next();
    long y = scanner.nextLong();
    switch (op) {
      case "+":
        System.out.println(x + y);
        break;
      case "-":
        System.out.println(x - y);
        break;
      case "*":
        System.out.println(x * y);
        break;
      case "/":
        if (y != 0) {
          System.out.println(x / y);
        } else {
          System.out.println("Division by 0!");
        }
        break;
        default:
          System.out.println("Unknown operator");
          break;
    }
  }
}
