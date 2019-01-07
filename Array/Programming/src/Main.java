import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      int size = scanner.nextInt();
      int arr[] = new int[size];
      for (int i = 0; i < arr.length; i++) {
        arr[i] = scanner.nextInt();
      }
      int n = scanner.nextInt();
      int m = scanner.nextInt();
      for (int i = 0; i < arr.length - 1; i++) {
        if (arr[i] == n && arr[i + 1] == m || arr[i] == m && arr[i + 1] == n) {
          System.out.println("true");
          return;
        }
      }
        System.out.println("false");
    }
  }
}