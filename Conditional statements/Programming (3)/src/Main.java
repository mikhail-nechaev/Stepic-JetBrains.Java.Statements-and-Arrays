import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String text = in.next();

    while (text.length() < 4)
      text = "0" + text;

    if (text.charAt(3) == text.charAt(0) && text.charAt(1) == text.charAt(2)) {
      System.out.println("1");
    } else {
      System.out.println("2");
    }

  }

}