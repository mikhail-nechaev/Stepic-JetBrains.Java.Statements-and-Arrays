import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int len = scanner.nextInt();
            int[] a = new int[len];
            for (int i = 0; i < len; i++) {
                a[i] = scanner.nextInt();
            }
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            boolean isContain = false;

            for (int i = 1; i < a.length; i++) {
                if (a[i] == n && a[i - 1] == m || a[i] == m && a[i - 1] == n) {
                    isContain = true;
                    break;
                }
            }
            System.out.println(isContain);
        }
    }
}