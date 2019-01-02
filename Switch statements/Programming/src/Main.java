import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    String res;
    switch (a) {
      case 1:
        res = "You have chosen a square";
        break;
      case 2:
        res = "You have chosen a circle";
        break;
      case 3:
        res = "You have chosen a triangle";
        break;
      case 4:
        res = "You have chosen a rhombus";
        break;
      default:
        res = "There is no such shape!";
    }
    System.out.println(res);
  }
}