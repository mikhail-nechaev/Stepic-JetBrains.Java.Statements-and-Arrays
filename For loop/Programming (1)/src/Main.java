import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int count = scanner.nextInt();
            int sum = 0;
            while (count-- > 0) {
                int x = scanner.nextInt();
                if (x % 6 == 0) {
                    sum += x;
                }
            }
            System.out.println(sum);
        }
    }
}