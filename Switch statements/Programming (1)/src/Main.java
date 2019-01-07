import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      int num = scanner.nextInt();
      switch (num) {
        case 0:
          System.out.print("do not move"); // в задании написано в этом варианте выводить на экран stay
          break;                           // но тогда тесты не проходят
        case 1:
          System.out.print("move up");
          break;
        case 2:
          System.out.print("move down");
          break;
        case 3:
          System.out.print("move left");
          break;
        case 4:
          System.out.print("move right");
          break;
        default:
          System.out.print("error!");
          break;
      }
    }
  }
}