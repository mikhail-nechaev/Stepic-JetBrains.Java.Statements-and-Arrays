import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int min = in.nextInt();
    int max = in.nextInt();
    int act = in.nextInt();

    if (act < min){
      System.out.println("Deficiency");
    } else if (act > max) {
      System.out.println("Excess");
    } else {
      System.out.println("Normal");
    }

  }
}