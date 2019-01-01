import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String s = String.format("%04d", scanner.nextInt());
            if ((s.charAt(0) == s.charAt(3)) && (s.charAt(1) == s.charAt(2))) {
                System.out.println(1);
            } else {
                System.out.println(s.hashCode());
            }
        }
    }

}