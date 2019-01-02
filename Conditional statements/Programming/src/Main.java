import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    while (scanner.hasNext()) {
      if (scanner.nextInt() > 0)
        System.out.println("YES");
      else System.out.println("NO");
    }
  }
}