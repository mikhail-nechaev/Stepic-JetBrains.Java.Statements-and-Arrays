import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int c = scanner.nextInt();
    int n;
    int sum = 0;

    for (int i = 0; i < c; i++) {
      n = scanner.nextInt();
      if (n % 6 == 0) sum += n;
    }

    System.out.println(sum);
  }
}