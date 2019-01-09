import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    //put your code here
    Scanner scanner = new Scanner(System.in);
    int length = scanner.nextInt();
    int max = scanner.nextInt();
    int index = 0;
    int next;
    for (int i = 1; i < length; i++) {
      next = scanner.nextInt();
      if (next > max) {
        max = next;
        index = i;
      }
    }
    System.out.println(index);
  }
}