import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int count = 0;
    int num = 0;

    do
    {
      num = scan.nextInt();
      if (num != 0)
      {
        ++count;
      }

    } while (num != 0);

    System.out.print(count);
  }
}