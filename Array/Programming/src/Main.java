import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int length = scanner.nextInt();
    int[] array = new int[length];
    for (int i = 0; i < length; i++) {
      array[i] = scanner.nextInt();
    }
    int n = scanner.nextInt();
    int m = scanner.nextInt();
    boolean answer = false;
    for (int i = 0; i < length - 1; i++) {
      if ((array[i] == n && array[i+1] == m) ||
              (array[i] == m && array[i+1] == n)) {
        answer = true;
        break;
      }
    }
    System.out.println(answer);
  }
}