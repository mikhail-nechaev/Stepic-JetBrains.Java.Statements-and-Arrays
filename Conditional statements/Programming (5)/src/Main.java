import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            int d = scanner.nextInt();
            if (a == c || a == d || b == c || b == d || Math.abs(a - c) == Math.abs(b - d)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}