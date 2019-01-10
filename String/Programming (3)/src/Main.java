import java.util.*;

public class Main {

  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      String inputString = scanner.nextLine();
      inputString = inputString.toLowerCase();
      int counter = 0;
      for (int i = 0; i < inputString.length(); i++) {
        char element = inputString.charAt(i);
        if (element == 'c' || element == 'g') counter++;
      }

      System.out.println((double) counter / inputString.length() * 100);
    }
  }
}