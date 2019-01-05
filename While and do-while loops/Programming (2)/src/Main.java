import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int result = 0;
            int a;
            while ((a = scanner.nextInt()) != 0) {
                result += a;
            }
            System.out.println(result);
        }
    }
}