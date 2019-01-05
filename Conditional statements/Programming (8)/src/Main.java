import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int count = scanner.nextInt();
            if (count < 1) {
                System.out.println("no army");
            } else if (count <= 4) {
                System.out.println("few");
            } else if (count <= 9) {
                System.out.println("several");
            } else if (count <= 19) {
                System.out.println("pack");
            } else if (count <= 49) {
                System.out.println("lots");
            } else if (count <= 99) {
                System.out.println("horde");
            } else if (count <= 249) {
                System.out.println("throng");
            } else if (count <= 499) {
                System.out.println("swarm");
            } else if (count <= 999) {
                System.out.println("zounds");
            } else {
                System.out.println("legion");
            }
        }
    }
}