import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            long m = scanner.nextLong();
            long curr = 1;
            int i = 1;
            while (curr <= m){
                i++;
                curr *= i;
            }
            System.out.println(i);
        }
    }
}