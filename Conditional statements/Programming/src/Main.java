import java.util.*;

public class Main {

  public static void main(String[] args) {
    try(Scanner scanner = new Scanner(System.in)) {
      int number = scanner.nextInt();

      if (number >0) {
        System.out.println("YES");
      } else {
        System.out.println("NO");
      }
    }
  }
}