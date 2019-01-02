import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int count = 0;
    int number;

    do {
      number = scanner.nextInt();
      count++;
    } while (number != 0);

    System.out.println(count - 1);
  }
}