import java.util.*;

public class Main {

  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      Long inputNumber = scanner.nextLong();
      Long smallestN = 1L, factorial = 1L;

      while (factorial <= inputNumber) {
        smallestN++;
        factorial *= smallestN;
      }

      System.out.println(smallestN);
    }
  }
}