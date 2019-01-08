import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int x = scanner.nextInt();
    if ((x > -15 && x <= 12) || (x > 14 && x < 17) || (x >= 19)) {
      System.out.println("True");
    } else {
      System.out.println("False");
    }
  }
}