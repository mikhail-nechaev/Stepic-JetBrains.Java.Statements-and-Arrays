import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    int b = scanner.nextInt();
    for (int i = a; i <= b; i++) {
      StringBuilder stringBuilder = new StringBuilder();
      if (i % 3 == 0) {
        stringBuilder.append("Fizz");
      }
      if (i % 5 == 0) {
        stringBuilder.append("Buzz");
      }
      if (stringBuilder.toString().equals("")) {
        stringBuilder.append(i);
      }
      System.out.println(stringBuilder);
    }
  }
}