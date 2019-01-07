import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      int num = scanner.nextInt();
      StringBuilder str = new StringBuilder();
      str.append("You have chosen a ");
      switch (num) {
        case 1:
          str.append("square");
          System.out.print(str);
          break;
        case 2:
          str.append("circle");
          System.out.print(str);
          break;
        case 3:
          str.append("triangle");
          System.out.print(str);
          break;
        case 4:
          str.append("rhombus");
          System.out.print(str);
          break;
         default:
           System.out.print("There is no such shape!");
           break;
      }
    }
  }
}