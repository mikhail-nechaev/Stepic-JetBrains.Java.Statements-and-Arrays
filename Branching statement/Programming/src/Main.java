import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    int num = 0;

    for (;;)
    {
      num = scan.nextInt();
      if (num == 0)
      {
        break;
      }
      if (num % 2 == 0)
      {
        System.out.println("even");
      }
      else
      {
        System.out.println("odd");
      }
    }
  }
}