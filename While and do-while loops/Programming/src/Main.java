import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int count = 0;
            while (scanner.nextInt() != 0) {
                count++;
            }
            System.out.println(count);
        }
    }
}