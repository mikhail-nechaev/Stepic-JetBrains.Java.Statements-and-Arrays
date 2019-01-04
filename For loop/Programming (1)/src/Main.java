import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    int c = scanner.nextInt();
    int curr = 0;
    int sum = 0;

    for (int i = 0; i < c; i++) {
      curr = scanner.nextInt();
      if (curr % 6 == 0) {
        sum += curr;
      }
    }

    System.out.println(sum);

  }
}