import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      int num = scanner.nextInt();
      int i = 1;
      while (i * i <= num) {
        System.out.println(i * i);
        i++;
      }
    }
  }
}