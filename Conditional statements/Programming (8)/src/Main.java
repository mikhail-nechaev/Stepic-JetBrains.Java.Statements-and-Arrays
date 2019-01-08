import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int x = scanner.nextInt();
    if (x < 1) {
      System.out.println("no army");
    } else if (x < 5) {
      System.out.println("few");
    } else if (x < 10) {
      System.out.println("several");
    } else if (x < 20) {
      System.out.println("pack");
    } else if (x < 50) {
      System.out.println("lots");
    } else if (x < 100) {
      System.out.println("horde");
    } else if (x < 250) {
      System.out.println("throng");
    } else if (x < 500) {
      System.out.println("swarm");
    } else if (x < 1000) {
      System.out.println("zounds");
    } else {
      System.out.println("legion");
    }
  }
}