import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int count = scanner.nextInt();
            int[] detector = {0, 0, 0};
            while (count-- > 0) {
                detector[scanner.nextInt() + 1]++;
            }
            System.out.println(detector[1] + " " + detector[2] + " " + detector[0]);
        }
    }
}