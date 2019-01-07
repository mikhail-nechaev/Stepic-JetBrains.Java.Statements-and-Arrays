import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      int arr[] = new int[scanner.nextInt()];
      for (int i = 0; i < arr.length; i++) {
        arr[i] = scanner.nextInt();
      }
      int max = arr[0];
      int index = 0;
      for (int i = 0; i < arr.length; i++) {
        if (arr[i] > max) {
          max = arr[i];
          index = i;
        }
      }
      System.out.println(index);
    }
  }
}