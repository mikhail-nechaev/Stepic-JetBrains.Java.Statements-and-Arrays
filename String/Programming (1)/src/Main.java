import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int maxLength = 0;
    String word = "";

    while (scan.hasNext())
    {
      String str = scan.next();
      if (str.length() > maxLength)
      {
        maxLength = str.length();
        word = str;
      }
    }
    System.out.print(word);

  }
}