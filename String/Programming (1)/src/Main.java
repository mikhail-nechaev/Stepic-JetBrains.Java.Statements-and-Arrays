import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String[] strings = scanner.nextLine().split(" ");
    String maxLen = strings[0];

    for (int i = 1; i < strings.length; i++) {
      if (strings[i].length() > maxLen.length()) {
          maxLen = strings[i];
      }
    }

    System.out.println(maxLen);
  }
}