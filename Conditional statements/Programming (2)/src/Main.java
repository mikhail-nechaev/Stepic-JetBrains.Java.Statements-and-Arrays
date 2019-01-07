import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      int num = scanner.nextInt();
      if ((num > -15 && num <= 12) || (num > 14 && num < 17) || (num >= 19)) {
        System.out.print("True");
      } else System.out.print("False");
    }
  }
}