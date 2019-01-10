import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    switch (in.next()) {
      case "triangle":
        double a = in.nextDouble(), b = in.nextDouble(), c = in.nextDouble();
        double p = 0.5 * (a + b + c);
        System.out.println(Math.sqrt(p * (p - a) * (p - b) * (p - c)));
        break;
      case "rectangle":
        System.out.println(in.nextDouble() * in.nextDouble());
        break;
      case "circle":
        double r = in.nextDouble();
        System.out.println(r * r * 3.14);
        break;
    }
  }
}