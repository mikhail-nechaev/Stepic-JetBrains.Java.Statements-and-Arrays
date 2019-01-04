import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int len = scanner.nextInt();
    int[] array = new int[len];
    for (int i = 0; i < len - 1; i++) {
      array[i + 1] = scanner.nextInt();
    }
    array[0] = scanner.nextInt();
    for (int i = 0; i < len; ++i) {
      System.out.print(array[i] + " ");
    }
  }
}