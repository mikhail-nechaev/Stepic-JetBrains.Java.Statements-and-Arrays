import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      int arr[] = new int[scanner.nextInt()];
      for (int i = 0; i < arr.length; i++) {
        arr[i] = scanner.nextInt();
      }
      int last = arr[arr.length - 1];
      for (int i = arr.length - 1; i > 0; i--) {
        arr[i] = arr[i - 1];
      }
      arr[0] = last;
      for (int val : arr) {
        System.out.print(val + " ");
      }
    }
  }
}