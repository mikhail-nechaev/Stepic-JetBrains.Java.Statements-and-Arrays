import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String s = scanner.next();

    int sum1 = s.charAt(0) + s.charAt(1) + s.charAt(2);
    int sum2 = s.charAt(3) + s.charAt(4) + s.charAt(5);

    if (sum1 == sum2) System.out.println("Lucky");
    else System.out.println("Regular");
  }
}