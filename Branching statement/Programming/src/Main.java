import java.util.*;

public class Main {

  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      int inputNumber;

      while (true) {
        inputNumber = scanner.nextInt();
        if (inputNumber == 0) break;
        if (inputNumber % 2 == 0) {
          System.out.println("even");
        } else {
          System.out.println("odd");
        }
      }
    }
  }
}