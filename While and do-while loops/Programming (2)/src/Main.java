import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int num;
    int sum = 0;

    do {
      num = scanner.nextInt();
      sum += num;
    } while (num != 0);

    System.out.println(sum);
  }
}