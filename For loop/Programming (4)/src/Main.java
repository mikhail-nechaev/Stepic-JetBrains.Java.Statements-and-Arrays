import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int sum = 0;
            int n = 0;
            for (int i = a; i <= b; i++) {
                if (i % 3 == 0) {
                    sum += i;
                    n++;
                }
            }

            System.out.println(sum * 1.0 / n);
        }
    }
}