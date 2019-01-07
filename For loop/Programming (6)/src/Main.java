import java.util.Scanner;

public class Main
{

  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);

    int a = scan.nextInt();
    int b = scan.nextInt();

    for (int i = a; i <= b; i++)
    {
      if (i % 5 == 0 && i % 3 == 0)
      {
        System.out.println("FizzBuzz");
      } else
      {
        if (i % 3 == 0)
        {
          System.out.println("Fizz");
        }
        if (i % 5 == 0)
        {
          System.out.println("Buzz");
        }

        if (i % 5 != 0 && i % 3 != 0)
        {
          System.out.println(i);
        }
      }

    }
  }
}