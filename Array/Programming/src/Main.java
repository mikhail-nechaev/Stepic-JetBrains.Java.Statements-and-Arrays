import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int length = scanner.nextInt();
    int[] arr = new int[length];
    for (int i = 0; i < length; i++)
      arr[i] = scanner.nextInt();

    int n = scanner.nextInt();
    int m = scanner.nextInt();
    boolean flag = false;

    for (int i = 1; i < length; i++) {
      if (arr[i] == n && arr[i - 1] == m ||
              arr[i] == m && arr[i - 1] == n) {
        flag = true;
        break;
      }
    }

    System.out.println(flag);
  }
}