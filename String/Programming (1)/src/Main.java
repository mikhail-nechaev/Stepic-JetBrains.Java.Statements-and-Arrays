import java.util.*;

public class Main {

  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      String inputString = scanner.nextLine();
      String[] numbers = inputString.split(" ");
      int maxLength = 0;
      String answer = new String();

      for (String element : numbers) {
        if (element.length() > maxLength) {
          maxLength = element.length();
          answer = element;
        }
      }

      System.out.println(answer);
    }
  }
}