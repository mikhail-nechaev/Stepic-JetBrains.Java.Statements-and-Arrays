import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    long number = scanner.nextLong();
    long factorial = 1;
    long result = 1 ;
    while (factorial <= number) {
      result++;
      factorial *= result;
    }
    System.out.println(result);
  }
}