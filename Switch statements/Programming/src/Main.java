import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int shape = scan.nextInt();

    switch (shape)
    {
      case 1: System.out.print("You have chosen a square");
      break;
      case 2: System.out.print("You have chosen a circle");
      break;
      case 3: System.out.print("You have chosen a triangle");
      break;
      case 4: System.out.print("You have chosen a rhombus");
      break;
      default: System.out.print("There is no such shape!");
    }
  }
}