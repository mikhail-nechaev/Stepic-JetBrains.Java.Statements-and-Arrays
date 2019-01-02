import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    String res;
    switch (a) {
      case 0:
        res = "do not move";
        break;
      case 1:
        res = "move up";
        break;
      case 2:
        res = "move down";
        break;
      case 3:
        res = "move left";
        break;
      case 4:
        res = "move right";
        break;
      default:
        res = "error!";
    }
    System.out.println(res);
  }
}