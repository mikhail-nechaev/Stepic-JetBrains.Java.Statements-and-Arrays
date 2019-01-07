import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    int in = sc.nextInt();
    switch (in) {
    case 0:
      //fixed according to advice in comments to task, as its description is incorrect
      //and not fixed in task itself
      System.out.println("do not move");
      break;
    case 1:
      System.out.println("move up");
      break;
    case 2:
      System.out.println("move down");
      break;
    case 3:
      System.out.println("move left");
      break;
    case 4:
      System.out.println("move right");
      break;
    default:
      System.out.println("error!");
    }
  }
}