import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            int d = scanner.nextInt();

            for (int i = 1; i <= 1000; i++) {
                int res = a * i * i * i + b * i * i + c * i + d;
                if (res == 0) {
                    System.out.println(i);
                }
            }

        }
    }
}