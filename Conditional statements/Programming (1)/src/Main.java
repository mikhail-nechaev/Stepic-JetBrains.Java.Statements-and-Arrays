import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int x = scanner.nextInt();
    int y = scanner.nextInt();
    int z = scanner.nextInt();
    if ((x >= y + z) || (y >= x + z) || (z >= x + y)) {
      System.out.println("NO");
    } else {
      System.out.println("YES");
    }
  }
}