import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int left = scanner.nextInt();
            int i = 1;
            while (left > 0) {
                for (int j = 0; j < Math.min(left, i); j++) {
                    System.out.print(i + " ");
                }
                left -= i;
                i++;
            }
        }
    }
}