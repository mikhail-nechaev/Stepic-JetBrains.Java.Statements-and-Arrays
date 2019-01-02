import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    String s1 = new Scanner(System.in).next();

    StringBuilder s2 = new StringBuilder(s1);
    s2.reverse();

    if (s1.equals(s2.toString()))
      System.out.println("yes");
    else System.out.println("no");

  }
}