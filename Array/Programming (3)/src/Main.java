import java.util.Arrays;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int length = scanner.nextInt();
    int[] arr = new int[length];

    for (int i = 1; i < length; i++)
      arr[i] = scanner.nextInt();

    arr[0] = scanner.nextInt();

    for (int i = 0; i < length; i++)
      System.out.print(arr[i] + " ");
  }
}