import java.lang.Math;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String shape = sc.nextLine();
    double a,b,c;
    switch (shape) {
    case "triangle":
      a = sc.nextDouble();
      b = sc.nextDouble();
      c = sc.nextDouble();
      double p = (a + b + c)/2;
      System.out.println(Math.sqrt(p*(p-a)*(p-b)*(p-c)));
      break;
    case "rectangle":
      a = sc.nextDouble();
      b = sc.nextDouble();
      System.out.println(a*b);
      break;
    case "circle":
      double r = sc.nextDouble();
      System.out.println(3.14 * r * r);
    }
  }
}