import java.util.*;

public class Main {

  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      int givenInt = scanner.nextInt();
      int counter = 1;

      while (counter * counter <= givenInt) {
        System.out.println(counter * counter);
        counter++;
      }
    }
  }
}