import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int number = scanner.nextInt();
    int c = 1;
    int printer = 1;
    while (number > 0) {
      while (c != 0) {
        System.out.print(printer + " ");
        c--;
        number--;
        if (number <= 0) break;
      }
      printer++;
      c = printer;
    }

  }
}