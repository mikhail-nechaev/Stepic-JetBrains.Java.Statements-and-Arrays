import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int count = scanner.nextInt();
            int[] grades = {0, 0, 0, 0};
            while (count-- > 0) {
                grades[scanner.nextInt() - 2]++;
            }
            for (int grade : grades) {
                System.out.print(grade + " ");
            }
        }
    }
}