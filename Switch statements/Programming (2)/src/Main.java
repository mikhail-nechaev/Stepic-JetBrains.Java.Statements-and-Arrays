import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    long first = in.nextLong();
    String op = in.next();
    long second = in.nextLong();

    switch (op){
      case "+":
        System.out.println((first + second));
        return;
      case "-":
        System.out.println((first - second));
        return;
      case "*":
        System.out.println((first * second));
        return;
      case "/":
        if (second == 0){
          System.out.println("Division by 0!");
          return;
        }
        System.out.println((first / second));
        return;
      default:
        System.out.println("Unknown operator");
        return;
    }

  }
}