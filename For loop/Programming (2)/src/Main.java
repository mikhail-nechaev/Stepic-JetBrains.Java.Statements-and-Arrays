import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int count = scanner.nextInt();
            int max = Integer.MIN_VALUE;
            while (count-- > 0) {
                int x = scanner.nextInt();
                if (x % 4 == 0 && x > max) {
                    max = x;
                }
            }
            System.out.println(max);
        }
    }
}