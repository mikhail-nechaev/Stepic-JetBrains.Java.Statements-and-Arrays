import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int tmp = in.nextInt();
    switch (tmp)
    {
      case 1:
        System.out.println("You have chosen a square");
        break;
      case 2:
        System.out.println("You have chosen a circle");
        break;
      case 3:
        System.out.println("You have chosen a triangle");
        break;
      case 4:
        System.out.println("You have chosen a rhombus");
        break;
      default:
        System.out.println("There is no such shape!");
    }
  }
}