import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int nums = scan.nextInt();
    int sum = 0;
    int current = 0;

    for (int i = 0; i < nums; i++)
    {
      current = scan.nextInt();
      if (current % 6 == 0)
      {
        sum += current;
      }
    }
    System.out.print(sum);
  }
}