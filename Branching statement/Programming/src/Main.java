import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int x;
            while ((x = scanner.nextInt()) != 0) {
                System.out.println(x % 2 == 0 ? "even" : "odd");
            }
        }
    }
}