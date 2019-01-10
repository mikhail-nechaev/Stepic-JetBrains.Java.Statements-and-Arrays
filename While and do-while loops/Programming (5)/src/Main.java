import java.util.*;

public class Main {

  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      int inputNumber = scanner.nextInt();
      int number = 1, counter = 0;

      while (counter < inputNumber) {
        for (int i = 0; i < number; i++) {
          if (counter == inputNumber) break;
          System.out.print(number + " ");
          counter++;
        }
        number++;
      }
    }
  }
}