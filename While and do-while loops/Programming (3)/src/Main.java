import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int max = scanner.nextInt();

    for (int i = 1; i * i <= max; i++) {
      System.out.println(i*i);
    }

  }
}