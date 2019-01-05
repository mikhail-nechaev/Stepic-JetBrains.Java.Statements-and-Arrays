import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            long m = scanner.nextLong();
            long current = 1;
            int i = 1;
            do {
                current *= ++i;
            } while (current <= m);
            System.out.println(i);
        }
    }
}