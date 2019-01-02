import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int x1 = scanner.nextInt();
    int y1 = scanner.nextInt();
    int x2 = scanner.nextInt();
    int y2 = scanner.nextInt();

    if (Math.abs(x1 - y1) == Math.abs(x2 - y2) || x1 == x2 || y1 == y2
    || x1+ y1 == x2 + y2)
      System.out.println("YES");
    else System.out.println("NO");
  }
}