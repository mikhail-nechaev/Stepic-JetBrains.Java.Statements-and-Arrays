import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    //put your code here
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int m = scanner.nextInt();
    int x = 0;
    int y = 0;
    int max = scanner.nextInt();
    for (int i = 1; i < n * m; i++) {
      int next = scanner.nextInt();
      if (next > max) {
        x = i / m;
        y = i % m;
        max = next;
      }
    }
    System.out.println(x + " " + y);
  }
}