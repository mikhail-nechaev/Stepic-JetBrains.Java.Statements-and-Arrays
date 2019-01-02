import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int m = scanner.nextInt();
    int k = scanner.nextInt();

    if (k > m*n) {
      System.out.println("NO");
      return;
    }
    boolean isAbleToSplit = (k % m == 0) || (k % n == 0);
    if (isAbleToSplit) {
      System.out.println("YES");
    } else {
      System.out.println("NO");
    }
  }
}