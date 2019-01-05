import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            for (int i = a; i <= b; i++) {
                if (i % 3 == 0){
                    System.out.print("Fizz");
                }
                if (i % 5 == 0){
                    System.out.print("Buzz");
                }
                if (i % 3 != 0 && i % 5 != 0){
                    System.out.print(i);
                }
                System.out.println();
            }
        }
    }
}