import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int count = scanner.nextInt();
            int[] array = new int[count];
            for (int i = 0; i < count; i++) {
                array[i] = scanner.nextInt();
            }
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            System.out.println(isContains(array, n, m));
        }
    }

    private static boolean isContains(int[] array, int n, int m) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == m && array[i + 1] == n || array[i] == n && array[i + 1] == m) {
                return true;
            }
        }
        return false;
    }
}