import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int times = scan.nextInt();
    int max = Integer.MIN_VALUE;
    int num = 0;

    while (times != 0)
    {
      num = scan.nextInt();
      if (num % 4 == 0 && num > max)
      {
        max = num;
      }
      --times;
    }
    System.out.print(max);
  }
}