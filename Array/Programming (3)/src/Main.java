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

    if (len != 1)
    {
      int leftHand = 0, rightHand = 0;
      for (int i = 0; i < len; i++)
      {
        if (i == 0)
        {
          leftHand = array[1];
          array[1] = array[0];
          continue;
        }

        if (i == len - 1)
        {
          rightHand = array[0];
          array[0] = leftHand;
          continue;
        }
        rightHand = array[i + 1];
        array[i + 1] = leftHand;
        leftHand = rightHand;
      }
    }

    for (int i: array)
    {
      System.out.print(i + " ");
    }
  }
}