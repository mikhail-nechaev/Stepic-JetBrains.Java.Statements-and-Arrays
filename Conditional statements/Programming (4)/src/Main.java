import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int count = scanner.nextInt();
            if ((count % 4 == 0 && count % 400 == 0) || (count % 4 == 0 && count % 100 != 0)) {
                System.out.println("Leap");
            } else {
                System.out.println("Regular");
            }
        }
    }
}