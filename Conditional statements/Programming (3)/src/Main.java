import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    StringBuilder num = new StringBuilder(in.next());
    while (num.length() < 4)
      num.insert(0, "0");
    for (int i = 0; i <= (num.length() - 1) / 2; i++) {
      if (num.charAt(i) != num.charAt(num.length() - i - 1)) {
        System.out.println(666);
        return;
      }
    }
    System.out.println(1);
  }
}