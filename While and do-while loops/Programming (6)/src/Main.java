import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int n = scanner.nextInt();
            System.out.print(n + " ");
            while (n > 1) {
                n = n % 2 == 0 ? n / 2 : n * 3 + 1;
                System.out.print(n + " ");
            }
        }
    }
}