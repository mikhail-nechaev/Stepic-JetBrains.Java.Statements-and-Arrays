import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    char[] input = scanner.next().toCharArray();
    int ctr = 1;
    for (int i = 0; i < input.length; i++) {
      if (i != input.length - 1 && input[i] == input[i+1]) {
        ctr++;
      } else {
        System.out.print("" + input[i] + ctr);
        ctr = 1;
      }
    }
  }
}