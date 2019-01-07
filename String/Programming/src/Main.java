import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      String  num = scanner.nextLine();
      if ((int)num.charAt(0) + (int)num.charAt(1) + (int)num.charAt(2) ==
              (int)num.charAt(3) + (int)num.charAt(4) + (int)num.charAt(5)) {
        System.out.println("Lucky");
      } else {
        System.out.println("Regular");
      }
    }
  }
}