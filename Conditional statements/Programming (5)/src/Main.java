import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int x1 = scan.nextInt();
    int y1 = scan.nextInt();

    int x2 = scan.nextInt();
    int y2 = scan.nextInt();

    if (x1 == x2 || y1 == y2)
    {
      System.out.print("YES");
    }
    else
    {
      if (Math.abs(x1 - x2) == Math.abs(y1 - y2))
      {
        System.out.print("YES");
      }
      else
      {
        System.out.print("NO");
      }
    }
  }
}