import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int h = scanner.nextInt();
            if (h < a) {
                System.out.println("Deficiency");
            } else if (h > b) {
                System.out.println("Excess");
            } else {
                System.out.println("Normal");
            }
        }
    }
}