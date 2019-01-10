import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String[] input = in.nextLine().split(" ");
    switch (input[1]) {
      case "+":
        System.out.println(Long.valueOf(input[0]) + Long.valueOf(input[2]));
        break;
      case "-":
        System.out.println(Long.valueOf(input[0]) - Long.valueOf(input[2]));
        break;
      case "*":
        System.out.println(Long.valueOf(input[0]) * Long.valueOf(input[2]));
        break;
      case "/":
        if (input[2].equals("0"))
          System.out.println("Division by 0!");
        else
          System.out.println(Long.valueOf(input[0]) / Long.valueOf(input[2]));
        break;
      default:
        System.out.println("Unknown operator");
    }
  }
}