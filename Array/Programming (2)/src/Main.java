import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int count = scanner.nextInt();
            if (count < 2) {
                System.out.println(scanner.nextInt());
                return;
            }
            int max1 = Integer.MIN_VALUE;
            int max2 = Integer.MIN_VALUE;
            for (int i = 0; i < count; i++) {
                int x = scanner.nextInt();
                if (x > max2) {
                    if (x > max1) {
                        max2 = max1;
                        max1 = x;
                    } else {
                        max2 = x;
                    }
                }
            }
            System.out.println(max1 * max2);
        }
    }
}