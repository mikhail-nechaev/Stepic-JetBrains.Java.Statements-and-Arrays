import java.util.*;

public class Main {

  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      int number = scanner.nextInt();

      if (number % 4 == 0) {
        if (number % 100 == 0) {
          if (number % 400 == 0) {
            System.out.println("Leap");
          } else {
            System.out.println("Regular");
          }
        } else {
          System.out.println("Leap");
        }
      } else {
        System.out.println("Regular");
      }
    }
  }
}