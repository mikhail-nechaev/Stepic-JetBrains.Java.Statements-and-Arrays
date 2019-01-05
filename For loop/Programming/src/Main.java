import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int from = scanner.nextInt();
            int to = scanner.nextInt();
            int sum = 0;
            for (int i = from; i <= to; i++) {
                sum += i;
            }
            System.out.println(sum);
        }
    }
}