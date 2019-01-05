import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int n = scanner.nextInt();

            for (int i = 0; i < n; i++){
                for (int j = 0; j < n; j++) {
                    if (i == j) {
                        System.out.print("* ");
                    }else if (n - 1 - i == j) {
                        System.out.print("* ");
                    } else if (n / 2 == j) {
                        System.out.print("* ");
                    } else if (n / 2 == i) {
                        System.out.print("* ");
                    } else {
                        System.out.print(". ");
                    }
                }
                System.out.println();
            }

        }
    }
}