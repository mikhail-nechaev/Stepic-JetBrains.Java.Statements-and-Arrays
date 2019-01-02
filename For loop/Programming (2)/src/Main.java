import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int c = scanner.nextInt();
    int n;
    int max = Integer.MIN_VALUE;

    for (int i = 0; i < c; i++) {
      n = scanner.nextInt();
      if (n % 4 == 0 && n > max)
        max = n;
    }

    System.out.println(max);
  }
}