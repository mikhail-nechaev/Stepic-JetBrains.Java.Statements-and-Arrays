import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    int in = sc.nextInt();
    String str = "";
    switch (in) {
    case 1:
        str += "square";
        break;
    case 2:
        str += "circle";
        break;
    case 3:
        str += "triangle";
        break;
    case 4:
        str += "rhombus";
        break;
    }
    if (str == "")
      System.out.println("There is no such shape!");
    else
      System.out.println("You have chosen a " +str);
  }
}