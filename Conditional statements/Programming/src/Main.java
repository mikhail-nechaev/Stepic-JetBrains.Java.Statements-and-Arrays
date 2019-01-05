import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int count = scanner.nextInt();
            System.out.println((count > 0) ? "YES" : "NO");
        }
    }
}