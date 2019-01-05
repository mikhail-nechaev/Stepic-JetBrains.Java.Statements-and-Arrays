import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String s = scanner.nextLine();

            StringBuilder sB = new StringBuilder(s);

            if (s.equals(sB.reverse().toString())){
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }
}