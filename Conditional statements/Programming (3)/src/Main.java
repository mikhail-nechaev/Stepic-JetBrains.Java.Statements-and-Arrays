import java.util.*;

public class Main {

  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      int number = scanner.nextInt();

      if (number % 10 == number / 1000 && number / 100 % 10 == number / 10 % 10) {
        System.out.println(1);
      } else {
        System.out.println(999);
      }
    }
  }
}