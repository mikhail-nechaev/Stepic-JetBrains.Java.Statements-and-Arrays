import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            long lhs = scanner.nextLong();
            char op = scanner.next().charAt(0);
            long rhs = scanner.nextLong();
            long res;
            switch (op) {
                case '+':
                    res = lhs + rhs;
                    break;
                case '-':
                    res = lhs - rhs;
                    break;
                case '/':
                    if (rhs == 0) {
                        System.out.println("Division by 0!");
                        return;
                    }
                    res = lhs / rhs;
                    break;
                case '*':
                    res = lhs * rhs;
                    break;
                default:
                    System.out.println("Unknown operator");
                    return;
            }
            System.out.println(res);
        }
    }
}