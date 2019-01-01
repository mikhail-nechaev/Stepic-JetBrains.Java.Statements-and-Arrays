import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int x;
            int sum = 0;
            while ((x = scanner.nextInt()) != 0) {
                sum += x;
            }
            System.out.println(sum);
        }
    }
}