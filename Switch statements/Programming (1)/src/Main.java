import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int next = in.nextInt();

    switch (next){
      case 1:
        System.out.println("move up");
        return;
      case 2:
        System.out.println("move down");
        return;
      case 3:
        System.out.println("move left");
        return;
      case 4:
        System.out.println("move right");
        return;
      case 0:
        System.out.println("do not move");
        return;
      default:
        System.out.println("error!");
        return;
    }

  }
}