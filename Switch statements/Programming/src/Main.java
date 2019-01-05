import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int i = in.nextInt();
    String res = "You have chosen a ";

    switch (i){
      case 1:
        res += "square";
        break;
      case 2:
        res += "circle";
        break;
      case 3:
        res += "triangle";
        break;
      case 4:
        res += "rhombus";
        break;
        default:
          System.out.println("There is no such shape!");
          return;
    }

    System.out.println(res);

  }
}