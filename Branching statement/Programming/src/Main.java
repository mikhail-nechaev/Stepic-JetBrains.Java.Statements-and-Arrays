import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int input;
    while ((input = scanner.nextInt()) != 0) {
      if (input % 2 == 0) {
        System.out.println("even");
      } else {
        System.out.println("odd");
      }
    }
  }
}