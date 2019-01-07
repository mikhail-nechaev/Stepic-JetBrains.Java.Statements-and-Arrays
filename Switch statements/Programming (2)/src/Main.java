import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      String str = scanner.nextLine();
      String pars[] = str.split(" ");
      switch (pars[1]) {
        case "+":
          System.out.print(Long.valueOf(pars[0]) + Long.valueOf(pars[2]));
          break;
        case "-":
          System.out.print(Long.valueOf(pars[0]) - Long.valueOf(pars[2]));
          break;
        case "/":
          if (pars[2].equals("0")) {
            System.out.print("Division by 0!");
          } else {
            System.out.print(Long.valueOf(pars[0]) / Long.valueOf(pars[2]));
          }
          break;
        case "*":
          System.out.print(Long.valueOf(pars[0]) * Long.valueOf(pars[2]));
          break;
         default:
           System.out.print("Unknown operator");
           break;
      }
    }
  }
}