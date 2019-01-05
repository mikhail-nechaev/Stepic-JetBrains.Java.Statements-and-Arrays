import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String s = scanner.nextLine();
            int result = 0;

            for (int i = 0; i < s.length(); i++) {
                switch (s.toLowerCase().charAt(i)) {
                case 'g':
                    result++;
                    break;
                case 'c':
                    result++;
                    break;
                }
            }

            System.out.println((double)result / s.length() * 100);

        }
    }
}