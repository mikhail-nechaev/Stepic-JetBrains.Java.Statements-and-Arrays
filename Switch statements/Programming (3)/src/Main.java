import java.util.Scanner;

public class Main {

    private static final double PI = 3.14;

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String shape = scanner.next();
            double area;
            switch (shape) {
                case "triangle": {
                    double a = scanner.nextDouble();
                    double b = scanner.nextDouble();
                    double c = scanner.nextDouble();
                    double p = (a + b + c) / 2;
                    area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
                    break;
                }
                case "rectangle": {
                    double a = scanner.nextDouble();
                    double b = scanner.nextDouble();
                    area = a * b;
                    break;
                }
                case "circle": {
                    double r = scanner.nextDouble();
                    area = PI * r * r;
                    break;
                }
                default:
                    System.out.println("error");
                    return;
            }
            System.out.println(area);
        }
    }
}