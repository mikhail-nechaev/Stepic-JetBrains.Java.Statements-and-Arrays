import java.util.*;

public class Main {

  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      String inputString = scanner.nextLine();
      String answer = new String();
      for (int i = inputString.length() - 1; i >= 0 ; i--) {
        answer += inputString.charAt(i);
      }

      if (inputString.equals(answer)) {
        System.out.println("yes");
      } else {
        System.out.println("no");
      }
    }
  }
}