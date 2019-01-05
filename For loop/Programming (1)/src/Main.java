import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int n = scanner.nextInt();
            int sum = 0;
            for (int i = 0; i < n; i++) {
                int a = scanner.nextInt();
                if (a % 6 == 0) {
                    sum += a;
                }
            }
            System.out.println(sum);
        }
    }
}