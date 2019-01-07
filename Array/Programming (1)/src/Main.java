import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int len = scan.nextInt();
    int[] array = new int[len];
    int indMax = 0;

    for (int i = 0; i < len; i++)
    {
      array[i] = scan.nextInt();
      if (array[i] > array[indMax])
      {
        indMax = i;
      }
    }

    System.out.print(indMax);
  }
}