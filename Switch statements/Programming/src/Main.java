import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int choose = scanner.nextInt();
            String shape;
            switch (choose) {
                case 1:
                    shape = "square";
                    break;
                case 2:
                    shape = "circle";
                    break;
                case 3:
                    shape = "triangle";
                    break;
                case 4:
                    shape = "rhombus";
                    break;
                default:
                    System.out.println("There is no such shape!");
                    return;
            }
            System.out.println("You have chosen a " + shape);
        }
    }
}