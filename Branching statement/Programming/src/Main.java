import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                int a = scanner.nextInt();
                if (a == 0) {
                    break;
                }
                if (a % 2 == 0) {
                    System.out.println("even");
                } else {
                    System.out.println("odd");
                }
            }

        }
    }
}