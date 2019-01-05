import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String type = in.next();

    double a;
    double b;
    double c;

    double p;

    double pi = 3.14;

    switch (type){
      case "triangle":
        a = in.nextDouble();
        b = in.nextDouble();
        c = in.nextDouble();
        p = 0.5 * (a + b + c);
        System.out.println(Math.sqrt(p * (p - a) * (p - c) * (p - b)));
        break;
      case "rectangle":
        a = in.nextDouble();
        b = in.nextDouble();
        System.out.println((a * b));
        break;
      case "circle":
        a = in.nextDouble();
        System.out.println(pi * a * a);
        break;
    }

  }
}