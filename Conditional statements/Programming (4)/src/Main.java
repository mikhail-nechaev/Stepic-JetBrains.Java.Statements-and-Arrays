import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int x = scanner.nextInt();
    if ((x % 4 == 0 && x % 100 != 0) || x % 400 == 0) {
      System.out.println("Leap");
    } else {
      System.out.println("Regular");
    }
  }
}