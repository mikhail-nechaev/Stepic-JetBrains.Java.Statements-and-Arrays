import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int in = scanner.nextInt();
    if (in > 0)
      System.out.println("YES");
    else
      System.out.println("NO");
  }
}