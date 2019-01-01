import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            long sum = 0;
            for (int i = a; i <= b; i++) {
                sum += i;
            }
            System.out.println(sum);
        }
    }
}