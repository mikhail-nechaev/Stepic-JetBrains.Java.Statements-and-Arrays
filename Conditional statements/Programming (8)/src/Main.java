import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      int count = scanner.nextInt();
      if (count < 1) {
        System.out.print("no army");
      } else if (count < 5) {
        System.out.print("few");
      } else if (count < 10) {
        System.out.print("several");
      } else if (count < 20) {
        System.out.print("pack");
      } else if (count < 50) {
        System.out.print("lots");
      } else if (count < 100) {
        System.out.print("horde");
      } else if (count < 250) {
        System.out.print("throng");
      } else if (count < 500) {
        System.out.print("swarm");
      } else if (count < 1000) {
        System.out.print("zounds");
      } else {
        System.out.print("legion");
      }
    }
  }
}