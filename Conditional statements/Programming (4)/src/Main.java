import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int year = scan.nextInt();

    if (year % 4 == 0 && year % 100 != 0)
    {
      System.out.print("Leap");
    }
    else
    {
      if (year % 400 == 0)
      {
        System.out.print("Leap");
      }
      else
      {
        System.out.print("Regular");
      }
    }
  }
}