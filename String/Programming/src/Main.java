import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String str = scanner.next();
            System.out.println(isLucky(str) ? "Lucky" : "Regular");
        }
    }

    private static boolean isLucky(String str) {
        String str1 = str.substring(0, 3);
        String str2 = str.substring(3, 6);
        return str1.chars().sum() == str2.chars().sum();
    }
}