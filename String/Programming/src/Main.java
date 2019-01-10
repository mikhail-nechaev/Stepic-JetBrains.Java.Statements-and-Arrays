import java.util.*;

public class Main {

  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      String inputString = scanner.next();
      int sum1 = 0, sum2 = 0;

      for (int i = 0; i < inputString.length() / 2; i++) {
        sum1 += Character.getNumericValue(inputString.charAt(i));
      }

      for (int j = inputString.length() / 2; j < inputString.length(); j++) {
        sum2 += Character.getNumericValue(inputString.charAt(j));
      }

      if (sum1 == sum2) {
        System.out.println("Lucky");
      } else {
        System.out.println("Regular");
      }
    }
  }
}