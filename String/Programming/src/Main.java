import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String string = scanner.next();
    char[] chars = string.toCharArray();
    if (chars[0] + chars[1] + chars[2] == chars[3] + chars[4] + chars[5]) {
      System.out.println("Lucky");
    } else {
      System.out.println("Regular");
    }
  }
}