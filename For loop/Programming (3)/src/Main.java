import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    a = scan.nextInt();
    b = scan.nextInt();
    c = scan.nextInt();
    d = scan.nextInt();

    if (isRoot(0))
    {
      System.out.println(0);
    }

    for (int i = 1; i <= 1000; i++)
    {
      if (d % i == 0)
      {
        if (isRoot(i))
        {
          System.out.println(i);
        }
      }
    }

  }

  public static boolean isRoot(int x)
  {
    int res = (a * (x * x * x)) + (b * (x * x)) + ((c * x) + d);
    if (res == 0)
    {
      return true;
    }
    else
    {
      return false;
    }
  }

  static int a, b, c, d;
}