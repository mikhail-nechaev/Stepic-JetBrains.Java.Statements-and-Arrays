import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int len = scan.nextInt();
    int[] array = new int[len];

    for (int i = 0; i < len; i++)
    {
      array[i] = scan.nextInt();
    }

    int n = scan.nextInt();
    int m = scan.nextInt();

    boolean answer = false;

    for (int i = 0; i < len; i++)
    {
      if (array[i] == n)
      {
        if (i == 0)
        {
          if (array[i + 1] == m)
          {
            answer = true;
          }
        }

        if (i == len - 1)
        {
          if (array[i - 1] == m)
          {
            answer = true;
          }
        }

        if (i != 0 && i != len - 1)
        {
          if (array[i - 1] == m || array[i + 1] == m)
          {
            answer = true;
          }
        }
      }
    }

    System.out.print(answer);
  }
}