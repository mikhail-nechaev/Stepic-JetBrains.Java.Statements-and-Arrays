import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String a_in = scanner.next();
    String b_in = scanner.next();
    String h_in = scanner.next();
    int a = Integer.parseInt(a_in);
    int b = Integer.parseInt(b_in);
    int h = Integer.parseInt(h_in);
    if ((h>=a)&&(h<=b))
      System.out.println("Normal");
    else if (h<a)
      System.out.println("Deficiency");
    else
      System.out.println("Excess");
  }
}