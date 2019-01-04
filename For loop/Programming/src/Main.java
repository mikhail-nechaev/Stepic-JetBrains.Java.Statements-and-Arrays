import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int min = scanner.nextInt();
    int max = scanner.nextInt();

    int sum = 0;

    for (int i = min; i <= max; i++) {
      sum += i;
    }

    System.out.println(sum);

  }
}