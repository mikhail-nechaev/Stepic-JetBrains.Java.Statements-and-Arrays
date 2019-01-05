import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int count = scanner.nextInt();
            if ((count % 10 == count / 1000) && ((count % 100) / 10 == (count % 1000) / 100)) {
                System.out.println("1");
            } else {
                System.out.println(count);
            }
        }
    }
}