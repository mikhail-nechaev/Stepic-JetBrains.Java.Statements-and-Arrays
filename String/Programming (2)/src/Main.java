import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    String str = scan.next();
    boolean isPolindrome = true;

    for (int i = 0; i < str.length() / 2; i++)
    {
      if (str.charAt(i) != str.charAt(str.length() - 1 - i))
      {
        isPolindrome = false;
        break;
      }
    }

    if (isPolindrome)
    {
      System.out.print("yes");
    }
    else
    {
      System.out.print("no");
    }
  }
}