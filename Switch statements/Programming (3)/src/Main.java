import java.util.*;

public class Main {

  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      String shape = scanner.nextLine();
      double pi = 3.14;
      switch (shape) {
      case "triangle":
        double at = scanner.nextDouble();
        double bt = scanner.nextDouble();
        double ct = scanner.nextDouble();

        double p = (at + bt +ct) / 2;

        double areat = p * (p - at) * (p - bt) * (p - ct);
        areat = Math.sqrt(areat);

        System.out.println(areat);
        break;

      case "rectangle":
        double ar = scanner.nextDouble();
        double br = scanner.nextDouble();

        double arear = ar * br;

        System.out.println(arear);
        break;

      case "circle":
        double r = scanner.nextDouble();

        double areac = pi * r * r;

        System.out.println(areac);
        break;
      }
    }
  }
}