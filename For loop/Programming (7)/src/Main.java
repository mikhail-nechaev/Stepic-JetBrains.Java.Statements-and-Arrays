import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int n = scanner.nextInt();
            int larger = 0;
            int smaller = 0;
            int perfect = 0;
            for (int i = 0; i < n; i++) {
                switch (scanner.nextInt()){
                case 1:
                    larger++;
                    break;
                case -1:
                    smaller++;
                    break;
                case 0:
                    perfect++;
                    break;
                }
            }

            System.out.println(perfect + " " + larger + " " + smaller);
        }
    }
}