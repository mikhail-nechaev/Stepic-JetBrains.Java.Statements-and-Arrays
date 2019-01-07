import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    String shape = scan.next();

    switch (shape)
    {
      case "rectangle": double a = scan.nextDouble();
      double b = scan.nextDouble();
      System.out.print(a * b);
      break;
      case "circle": double r = scan.nextDouble();
      System.out.print(3.14 * r * r);
      break;
      case "triangle": double x = scan.nextDouble();
      double y = scan.nextDouble();
      double z = scan.nextDouble();
      double p = (x + y + z) / 2;
      double s = Math.sqrt(p * (p - x) * (p - y) * (p - z));
      System.out.print(s);
      break;
      default: System.out.print("There is not this shape");
    }
  }
}