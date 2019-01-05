import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String shape = scanner.next();
            double a, b , c;
            switch (shape) {
            case "triangle":
                a = scanner.nextDouble();
                b = scanner.nextDouble();
                c = scanner.nextDouble();
                double semiPerimeter = (a + b + c) / 2.0;
                double square = Math.sqrt(semiPerimeter * (semiPerimeter - a) * (semiPerimeter - b) *
                        (semiPerimeter - c));
                System.out.println(square);
                break;
            case "rectangle":
                a = scanner.nextDouble();
                b = scanner.nextDouble();
                System.out.println(a * b);
                break;
            case "circle":
                a = scanner.nextDouble();
                System.out.println(Math.pow(a, 2) * 3.14);
                break;
            }
        }
    }
}