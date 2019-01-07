import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int length = scan.nextInt();
    int current = 1;
    int curLength = 0;
    int times = 0;

    while (curLength < length)
    {
      times = 0;
      while (times < current)
      {
        System.out.print(current + " ");
        ++times;
        ++curLength;
        if (length == curLength)
        {
          break;
        }
      }
      ++current;
    }
  }
}