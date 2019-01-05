import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int n = scanner.nextInt();
            int i = 1;
            while (n > 0) {
                int j = i;
                while (j > 0 && n > 0){
                    System.out.print(i + " ");
                    j--;
                    n--;
                }
                i++;
            }
        }

    }
}