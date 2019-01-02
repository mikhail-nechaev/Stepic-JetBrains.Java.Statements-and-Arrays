import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int length = scanner.nextInt();
    int[] arr = new int[length];
    int max = Integer.MIN_VALUE;

    for (int i = 0; i < length; i++)
      arr[i] = scanner.nextInt();

    if (arr.length != 1) {
      for (int i = 1; i < length; i++) {
        if (arr[i - 1] * arr[i] > max)
          max = arr[i - 1] * arr[i];
      }

      System.out.println(max);
    } else System.out.println(arr[0]);

  }
}