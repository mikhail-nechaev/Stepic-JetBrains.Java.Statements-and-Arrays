import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int a = in.nextInt();
    int b = in.nextInt();
    int c = in.nextInt();

    if (a + b <= c || b + c <= a || a + c <= b) {
      System.out.println("NO");
    } else {
      System.out.println("YES");
    }

  }
}