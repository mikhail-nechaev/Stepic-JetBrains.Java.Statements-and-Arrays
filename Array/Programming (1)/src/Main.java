import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int length = scanner.nextInt();
    int[] arr = new int[length];
    int max = Integer.MIN_VALUE;
    int indexMax = 0;
    for (int i = 0; i < length; i++) {
      arr[i] = scanner.nextInt();
      if (arr[i] > max) {
        max = arr[i];
        indexMax = i;
      }
    }

    System.out.println(indexMax);
  }
}