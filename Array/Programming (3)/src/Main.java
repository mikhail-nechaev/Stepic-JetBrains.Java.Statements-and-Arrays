import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    //put your code here
    Scanner scanner = new Scanner(System.in);
    int length = scanner.nextInt();
    int[] array = new int[length];
    for (int i = 1; i < length; i++) {
      array[i] = scanner.nextInt();
    }
    array[0] = scanner.nextInt();
    for (int i: array) {
      System.out.print(i + " ");
    }
  }
}