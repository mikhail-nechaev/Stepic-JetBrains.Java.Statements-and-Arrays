import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String genom = scanner.next();
            double count = genom.toLowerCase().chars()
                    .filter(ch -> ch == 'c' || ch == 'g')
                    .count();
            System.out.println(count / genom.length() * 100);
        }
    }
}