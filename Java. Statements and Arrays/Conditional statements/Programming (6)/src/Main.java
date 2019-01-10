import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int firstAl = in.nextInt();
    int secondAl = in.nextInt();
    int hour = in.nextInt();
    System.out.println(hour<firstAl ? "Deficiency" : hour>secondAl ? "Excess" : "Normal");
  }
}