import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    int b = scanner.nextInt();
    int x = scanner.nextInt();
    if (x > a*b)
      System.out.println("NO");
    else if ((x%a == b || x%b == a || x%a == 0 || x%b == 0))
      System.out.println("YES");
    else
      System.out.println("NO");
  }
}