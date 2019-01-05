import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int c = 0;
    while (scanner.nextInt() != 0)
      c++;

    System.out.println(c);
  }
}