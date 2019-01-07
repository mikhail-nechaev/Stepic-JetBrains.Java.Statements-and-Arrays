import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int in = scanner.nextInt();
    if (((in>-15)&&(in<=12))||((in>14) && (in < 17))|| (in>=19))
      System.out.println("True");
    else
      System.out.println("False");
  }
}