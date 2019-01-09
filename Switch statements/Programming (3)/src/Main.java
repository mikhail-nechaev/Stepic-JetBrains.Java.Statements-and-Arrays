import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String shape = scanner.next();
    switch (shape) {
    case "rectangle":
      int a = scanner.nextInt();
      int b = scanner.nextInt();
      System.out.println(a * b);
      break;
    case "circle":
      int r = scanner.nextInt();
      System.out.println(3.14 * r * r);
      break;
    case "triangle":
      int x = scanner.nextInt();
      int y = scanner.nextInt();
      int z = scanner.nextInt();
      double p = 0.5 * (x + y + z);
      System.out.println(Math.sqrt(p * (p - x) * (p - y) * (p - z)));
      break;
    }
  }
}