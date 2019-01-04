import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int num = in.nextInt();

    if (num > 0) {
      System.out.println("YES");
    } else {
      System.out.println("NO");
    }

  }
}