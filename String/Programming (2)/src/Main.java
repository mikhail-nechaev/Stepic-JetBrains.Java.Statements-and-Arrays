import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    char[] chars = scanner.next().toCharArray();
    String answer = "yes";
    for (int i = 0; i < chars.length / 2; i++) {
      if (chars[i] != chars[chars.length - i - 1]) {
        answer = "no";
        break;
      }
    }
    System.out.println(answer);
  }
}