import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int dir = scan.nextInt();

    switch (dir)
    {
      case 1: System.out.print("move up");
        break;
      case 2: System.out.print("move down");
        break;
      case 3: System.out.print("move left");
        break;
      case 4: System.out.print("move right");
        break;
      case 0: System.out.print("do not move");
        break;
        default: System.out.print("error!");
    }
  }
}