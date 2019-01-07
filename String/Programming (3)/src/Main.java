import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      String str = scanner.nextLine();
      double count = 0;
      str = str.toLowerCase();
      for (char c : str.toCharArray()) {
        if (c == 'c' || c == 'g') {
          count++;
        }
      }
      System.out.println(count*100/str.length());
    }
  }
}