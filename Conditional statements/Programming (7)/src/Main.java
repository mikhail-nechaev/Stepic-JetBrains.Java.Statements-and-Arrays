import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            int k = scanner.nextInt();
            if (k < m * n && (k % m == 0 || k % n == 0)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}