import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      int year = scanner.nextInt();
      if (year % 4 == 0) {
         if (year % 100 == 0) {
           if (year % 400 == 0) {
             System.out.print("Leap");
           } else System.out.print("Regular");
         } else {
           System.out.print("Leap");
         }
      } else {
        System.out.print("Regular");
      }
    }
  }
}