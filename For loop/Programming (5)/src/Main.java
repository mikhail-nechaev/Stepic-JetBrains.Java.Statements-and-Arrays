import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int n = scanner.nextInt();
            int Ds = 0;
            int Cs = 0;
            int Bs = 0;
            int As = 0;
            for (int i = 0; i < n; i++) {
                switch (scanner.nextInt()){
                case 2:
                    Ds++;
                    break;
                case 3:
                    Cs++;
                    break;
                case 4:
                    Bs++;
                    break;
                case 5:
                    As++;
                    break;
                }
            }

            System.out.println(Ds + " " + Cs + " " + Bs + " " + As);
        }
    }
}