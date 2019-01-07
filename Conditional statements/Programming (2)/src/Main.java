import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int num = scan.nextInt();

    if (num > -15 && num <= 12)
    {
      System.out.print("True");
    }
    else
    {
      if (num > 14 && num < 17)
      {
        System.out.print("True");
      }
      else
      {
        if (num >= 19)
        {
          System.out.print("True");
        }
        else
        {
          System.out.print("False");
        }
      }
    }
  }
}