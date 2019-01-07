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

    int max1 = 0, max2 = 0;

    if (len == 1)
    {
      System.out.print(array[0]);
    }
    else
    {
      for (int i = 0; i < len; i++)
      {
        if (array[i] > max1)
        {
          max2 = max1;
          max1 = array[i];
        }
        else
        {
          if (array[i] > max2)
          {
            max2 = array[i];
          }
        }
      }
      System.out.print(max1 * max2);
    }
  }
}