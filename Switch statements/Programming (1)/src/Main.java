import java.util.*;

public class Main {

  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      int inputValue = scanner.nextInt();
      String answer = "move ";
      switch (inputValue) {
        case 0:
          System.out.println("do not move");
          break;
        case 1:
          System.out.println(answer + "up");
          break;
        case 2:
          System.out.println(answer + "down");
          break;
        case 3:
          System.out.println(answer + "left");
          break;
        case 4:
          System.out.println(answer + "right");
          break;

          default:
        System.out.println("error!");
      }
    }
  }
}