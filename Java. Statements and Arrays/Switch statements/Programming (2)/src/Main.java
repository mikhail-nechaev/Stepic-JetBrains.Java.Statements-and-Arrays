import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String[] n = in.nextLine().split("\\s");
    long f = Long.parseLong(n[0]);
    long s = Long.parseLong(n[2]);

    switch (n[1]) {
      case "+":
        System.out.println(f+s);
        break;
      case "-":
        System.out.println(f-s);
        break;
      case "/":
        if (s == 0 ) System.out.println("Division by 0!");
        else System.out.println(f/s);
        break;
      case "*":
        System.out.println(f*s);
        break;
      default:
        System.out.println("Unknown operator");
    }
  }
}