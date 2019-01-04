import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String t = scanner.next();

    int f = t.charAt(0) + t.charAt(1) + t.charAt(2);
    int s = t.charAt(3) + t.charAt(4) + t.charAt(5);

    if (f == s){
      System.out.println("Lucky");
    } else {
      System.out.println("Regular");
    }

  }
}