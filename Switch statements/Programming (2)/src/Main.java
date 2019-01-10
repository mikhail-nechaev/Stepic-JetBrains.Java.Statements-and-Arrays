import java.util.*;

public class Main {

  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      String equation = scanner.nextLine();
      String[] elements = equation.split(" ");

      switch (elements[1]) {
        case "+":
          System.out.println(Long.valueOf(elements[0]) + Long.valueOf(elements[2]));
          break;
        case "-":
          System.out.println(Long.valueOf(elements[0]) - Long.valueOf(elements[2]));
          break;
        case "/":
          if (Long.valueOf(elements[2]) == 0) {
            System.out.println("Division by 0!");
            break;
          } else {
            System.out.println(Long.valueOf(elements[0]) / Long.valueOf(elements[2]));
            break;
          }
        case "*":
          System.out.println(Long.valueOf(elements[0]) * Long.valueOf(elements[2]));
          break;

          default:
            System.out.println("Unknown operator");
            break;
      }
    }
  }
}