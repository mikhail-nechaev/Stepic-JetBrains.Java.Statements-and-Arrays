import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int x = scanner.nextInt();
            if (x < 1) {
                System.out.println("no army");
            } else if (x <= 4) {
                System.out.println("few");
            } else if (x <= 9) {
                System.out.println("several");
            } else if (x <= 19) {
                System.out.println("pack");
            } else if (x <= 49) {
                System.out.println("lots");
            } else if (x <= 99) {
                System.out.println("horde");
            } else if (x <= 249) {
                System.out.println("throng");
            } else if (x <= 499) {
                System.out.println("swarm");
            } else if (x <= 999) {
                System.out.println("zounds");
            } else {
                System.out.println("legion");
            }
        }
    }
}