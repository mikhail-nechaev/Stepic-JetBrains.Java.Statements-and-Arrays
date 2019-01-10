import java.util.*;

public class Main {

  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      int inputValue = scanner.nextInt();
      String answer = "You have chosen a ";
      switch (inputValue) {
      case 1:
        System.out.println(answer + "square");
        break;
      case 2:
        System.out.println(answer + "circle");
        break;
      case 3:
        System.out.println(answer + "triangle");
        break;
      case 4:
        System.out.println(answer + "rhombus");
        break;

        default:
          System.out.println("There is no such shape!");
      }
    }
  }
}