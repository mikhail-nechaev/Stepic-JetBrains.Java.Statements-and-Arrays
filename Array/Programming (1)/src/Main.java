import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int count = scanner.nextInt();
            int max = Integer.MIN_VALUE;
            int index = -1;
            for (int i = 0; i < count; i++) {
                int x = scanner.nextInt();
                if (x > max) {
                    max = x;
                    index = i;
                }
            }
            System.out.println(index);
        }
    }
}