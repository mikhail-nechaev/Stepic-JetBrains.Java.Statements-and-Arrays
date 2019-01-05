import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int x1 = in.nextInt();
    int y1 = in.nextInt();
    int x2 = in.nextInt();
    int y2 = in.nextInt();

    if ((x1 == x2) || (y1 == y2) || (Math.abs(x1 - x2) == Math.abs(y1 - y2))) {
      System.out.println("YES");
    } else {
      System.out.println("NO");
    }

  }
}