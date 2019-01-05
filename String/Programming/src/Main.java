import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String s = scanner.nextLine();
            int res1 = 0;
            int res2 = 0;
            for (int i = 0; i < s.length(); i++) {
                if (i < 3) {
                    res1 += s.charAt(i);
                } else {
                    res2 += s.charAt(i);
                }
            }

            if (res1 == res2) {
                System.out.println("Lucky");
            } else {
                System.out.println("Regular");
            }

        }
    }
}