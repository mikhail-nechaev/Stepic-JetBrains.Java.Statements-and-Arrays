import java.util.*;

public class Main {

  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      int inputNumber = scanner.nextInt();
      int answer = inputNumber;

      System.out.print(inputNumber + " ");

      while (answer > 1) {
        if (answer % 2 == 0) {
          answer /= 2;
        } else {
          answer = answer * 3 + 1;
        }

        System.out.print(answer + " ");

      }

    }
  }
}