import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String s = scanner.nextLine();

            int count = 1;

            for (int i = 0; i < s.length(); i++) {
                if (i != s.length() - 1 && s.charAt(i + 1) == s.charAt(i)) {
                    count++;
                } else if (i == s.length() - 1) {
                    System.out.print("" + s.charAt(i) + count);
                } else {
                    System.out.print("" + s.charAt(i) + count);
                    count = 1;
                }
            }

        }
    }
}