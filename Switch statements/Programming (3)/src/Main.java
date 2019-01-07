import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      String shape = scanner.nextLine().trim();
      switch (shape) {
        case "triangle":
          double a = scanner.nextDouble();
          double b = scanner.nextDouble();
          double c = scanner.nextDouble();
          double p = (a + b + c)/2;
          double res = Math.sqrt(p*(p-a)*(p-b)*(p-c));
          System.out.print(res);
          break;
        case "rectangle":
          double ar = scanner.nextDouble();
          double br = scanner.nextDouble();
          double resr = ar * br;
          System.out.print(resr);
          break;
        case "circle":
          double r = scanner.nextDouble();
          double resc = r * r * 3.14;
          System.out.print(resc);
          break;

      }
    }
  }
}