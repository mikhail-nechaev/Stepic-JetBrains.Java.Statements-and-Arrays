import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int bound = scanner.nextInt();
            int curr = 1;
            while (curr * curr <= bound) {
                System.out.println(curr * curr);
                curr++;
            }
        }
    }
}