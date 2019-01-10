import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner in = new Scanner (System.in);
    int n = in.nextInt();
    if(n%400 == 0 || (n%4 == 0 && n%100 != 0)) System.out.print("Leap");
    else System.out.print("Regular");
  }
}