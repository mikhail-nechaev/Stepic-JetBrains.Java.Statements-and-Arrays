import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int n = scanner.nextInt();
            int max = 0;
            for (int i = 0; i < n; i++) {
                int cur = scanner.nextInt();
                if (cur % 4 == 0 && cur > max) {
                    max = cur;
                }
            }
            System.out.println(max);
        }
    }
}