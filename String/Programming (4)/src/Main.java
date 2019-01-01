import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String genom = scanner.next();
            String encoded = Arrays.stream(genom.split("(?<=(.))(?!\\1)"))
                    .map(chunk -> "" + chunk.charAt(0) + chunk.length())
                    .collect(Collectors.joining(""));
            System.out.println(encoded);
        }
    }
}