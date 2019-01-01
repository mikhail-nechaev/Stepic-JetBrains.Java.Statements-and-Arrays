import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int curr = scanner.nextInt();
            while (curr != 1) {
                System.out.print(curr + " ");
                if (curr % 2 == 0) {
                    curr = curr / 2;
                } else {
                    curr = curr * 3 + 1;
                }
            }
            System.out.println(curr);
        }
    }
}