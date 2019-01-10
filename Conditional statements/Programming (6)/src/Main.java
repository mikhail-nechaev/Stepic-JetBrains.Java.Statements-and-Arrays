import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int a = in.nextInt(), b = in.nextInt(), h = in.nextInt();
    System.out.println(h < a ? "Deficiency" : h > b ? "Excess" : "Normal");
  }
}