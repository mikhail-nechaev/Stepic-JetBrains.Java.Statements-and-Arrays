import java.util.*;

public class Main {

  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      int numOfUnits = scanner.nextInt();

      if (numOfUnits < 1) {
        System.out.println("no army");
      } else if (numOfUnits < 5) {
        System.out.println("few");
      } else if (numOfUnits < 10) {
        System.out.println("several");
      } else if (numOfUnits < 20) {
        System.out.println("pack");
      } else if (numOfUnits < 50) {
        System.out.println("lots");
      } else if (numOfUnits < 100) {
        System.out.println("horde");
      } else if (numOfUnits < 250) {
        System.out.println("throng");
      } else if (numOfUnits < 500) {
        System.out.println("swarm");
      } else if (numOfUnits < 1000) {
        System.out.println("zounds");
      } else {
        System.out.println("legion");
      }

    }
  }
}