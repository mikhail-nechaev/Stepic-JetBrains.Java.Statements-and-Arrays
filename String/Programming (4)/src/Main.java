import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    String str = scan.next();
    StringBuilder convStr = new StringBuilder();

    for (int i = 0; i < str.length(); i++)
    {
      char cur = str.charAt(i);
      int count = 0;
      while (str.charAt(i) == cur)
      {
        ++count;
        ++i;
        if (i == str.length())
        {
          break;
        }
      }
      --i;
      convStr.append(cur);
      convStr.append(count);
    }

    System.out.print(convStr);
  }
}
