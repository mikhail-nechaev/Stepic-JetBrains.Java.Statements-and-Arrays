import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int num = 0;
    boolean work = true;

    int limit = scan.nextInt();

    while (work)
    {
      ++num;
      if (num * num <= limit)
      {
        System.out.println(num * num);
      }
      else
      {
        work = false;
      }
    }
  }
}