import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int polind = scan.nextInt();

    int num1 = polind % 10;
    polind /= 10;

    int num2 = polind % 10;
    polind /= 10;

    int num3 = polind % 10;
    polind /= 10;

    int num4 = polind % 10;
    polind /= 10;

    if (num1 == num4 && num2 == num3)
    {
      System.out.print(1);
    }
    else
    {
      System.out.print(2);
    }
  }
}