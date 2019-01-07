import java.util.LinkedList;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      int num = scanner.nextInt();
      if (num % 10 == num / 1000 && num / 10 % 10 == num / 100 % 10) {
        System.out.print(1);
      } else System.out.print(9);
    }
  }
}