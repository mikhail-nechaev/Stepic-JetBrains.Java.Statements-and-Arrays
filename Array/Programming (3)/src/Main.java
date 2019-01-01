import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int count = scanner.nextInt();
            int[] array = new int[count];
            for (int i = 1; i < count; i++) {
                array[i] = scanner.nextInt();
            }
            array[0] = scanner.nextInt();
            for (int i : array) {
                System.out.print(i + " ");
            }
        }
    }
}