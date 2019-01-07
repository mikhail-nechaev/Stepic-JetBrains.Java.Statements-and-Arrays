import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int num = scan.nextInt();

    while (num != 1)
    {
      System.out.print(num + " ");
      if (num % 2 == 0)
      {
        num /= 2;
      }
      else
      {
        num = num * 3 + 1;
      }
    }
    System.out.print("1");
  }
}