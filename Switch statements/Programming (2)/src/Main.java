import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    long a = scanner.nextLong();
    String operator = scanner.next();
    long b = scanner.nextLong();
    String res = "";
    long answer = 0L;

    switch (operator) {
      case "+":
        answer = a + b;
        break;
      case "-":
        answer = a - b;
        break;
      case "*":
        answer = a * b;
        break;
      case "/":
        if (b == 0) res = "Division by 0!";
        else
        answer = a / b;
        break;
      default:
        res = "Unknown operator";
    }
    if (res.length() == 0) res = Long.toString(answer);

    System.out.println(res);
  }
}