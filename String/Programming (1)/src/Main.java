import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String[] input = scanner.nextLine().split("\\s");
            String longest = Arrays.stream(input)
                    .sorted((s1, s2) -> Integer.compare(s2.length(), s1.length()))
                    .findFirst()
                    .get();
            System.out.println(longest);
        }
    }
}