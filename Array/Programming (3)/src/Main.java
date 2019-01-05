import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int n = scanner.nextInt();
            int[] a = new int[n];
            for (int i = 1; i < n; i++) {
                a[i] = scanner.nextInt();
            }
            a[0] = scanner.nextInt();

            for (int i : a){
                System.out.print(i + " ");
            }
        }
    }
}