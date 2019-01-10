import java.util.*;

public class Main {

  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      String inputString = scanner.nextLine();

      int counter = 1;
      for (int i = 1; i < inputString.length(); i++) {
        if (inputString.charAt(i - 1) == inputString.charAt(i)) {
          counter++;
        } else {
          System.out.print(inputString.charAt(i - 1));
          System.out.print(counter);
          counter = 1;
        }
      }
      System.out.print(inputString.charAt(inputString.length() - 1));
      System.out.print(counter);
    }
  }
}