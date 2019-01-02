import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    int b = scanner.nextInt();
    int sum = 0;
    float count = 0.0f;

    for (int i = a; i <= b; i++) {
      if (i % 3 == 0) {
        count++;
        sum += i;
      }
    }

    System.out.println(sum / count);
  }
}
