import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int count = scanner.nextInt();
            if (count > -15 && count <= 12 || count > 14 && count < 17 || count >= 19) {
                System.out.println("True");
            } else {
                System.out.println("False");
            }
        }
    }
}