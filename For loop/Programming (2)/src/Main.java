import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int nums = scan.nextInt();
    int current = 0;
    int max = 0;

    for (int i = 0; i < nums; i++)
    {
      current = scan.nextInt();
      if (current > max && current % 4 == 0)
      {
        max = current;
      }
    }
    System.out.print(max);
  }
}