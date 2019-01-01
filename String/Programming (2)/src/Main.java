import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String str = scanner.next();
            System.out.println(isPalindrome(str) ? "yes" : "no");
        }
    }

    private static boolean isPalindrome(String str) {
        return new StringBuilder(str).reverse().toString().equals(str);
    }
}