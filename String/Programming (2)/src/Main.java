import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    StringBuilder word = new StringBuilder(scanner.next());
    String before = word.toString();
    if (before.equals(word.reverse().toString())){
      System.out.println("yes");
    } else {
      System.out.println("no");
    }

  }
}