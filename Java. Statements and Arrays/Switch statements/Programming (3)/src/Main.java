import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String str = in.next();
    switch (str) {
      case "rectangle":
        System.out.println(in.nextDouble()*in.nextDouble());
        break;
      case "triangle":
        double a=in.nextDouble();
        double b=in.nextDouble();
        double c=in.nextDouble();
        double p=0.5*(a+b+c);
        System.out.println(Math.sqrt(p*(p-a)*(p-b)*(p-c)));
        break;
      case"circle":
        double r=in.nextDouble();
        System.out.println(r*r*3.14);
        break;
      default:
        System.out.println("Unknown operator");
    }
  }
}