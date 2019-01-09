import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = new String();
        str = scan.next();
        switch (str) { 
            case "rectangle": 
                System.out.println(scan.nextDouble()*scan.nextDouble());break;
            case "triangle":
                double a=scan.nextDouble();
                double b=scan.nextDouble();
                double c=scan.nextDouble();
                double p=0.5*(a+b+c);
                System.out.println(Math.sqrt(p*(p-a)*(p-b)*(p-c)));break;
            case"circle":
                double r=scan.nextDouble();
                System.out.println(r*r*3.14);break;
            default:
                System.out.println("Unknown operator");
        }

    }
}