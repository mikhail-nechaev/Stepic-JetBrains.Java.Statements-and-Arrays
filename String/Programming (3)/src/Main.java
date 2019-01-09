import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    //put your code here
    Scanner scanner = new Scanner(System.in);
    String genome = scanner.next().toLowerCase();
    int ctr = 0;
    for (char c: genome.toCharArray()) {
      if (c == 'c' || c == 'g') {
        ctr++;
      }
    }
    System.out.println((double) ctr / genome.length() * 100);
  }
}