import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      int arr[] = new int[scanner.nextInt()];
      for (int i = 0; i < arr.length; i++) {
        arr[i] = scanner.nextInt();
      }
      int max1 = -1;
      int max2 = -1;
      for (int val : arr) {
        if (val > max1) {
          max2 = max1;
          max1 = val;
        } else if (val > max2) {
          max2 = val;
        }
      }
      if (max1 == -1) max1 = 1;
      if (max2 == -1) max2 = 1;
      System.out.println(max1 * max2);
    }
  }
}