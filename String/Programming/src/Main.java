import java.util.Scanner;

public class Main {

  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);

    String str = scan.next();

    int left = Integer.valueOf(str.substring(0, 1)) +
            Integer.valueOf(str.substring(1, 2)) +
            Integer.valueOf(str.substring(2, 3));
    int right = Integer.valueOf(str.substring(3, 4)) +
            Integer.valueOf(str.substring(4, 5)) +
            Integer.valueOf(str.substring(5, 6));

    if (left == right)
    {
      System.out.print("Lucky");
    }
    else
    {
      System.out.print("Regular");
    }
  }
}