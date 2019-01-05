import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int n = scanner.nextInt();
            int max = 0;
            while (n > 0) {
                int next = scanner.nextInt();
                if (next % 4 == 0 && next > max) {
                    max = next;
                }
                n--;
            }
            System.out.println(max);
        }
    }
}