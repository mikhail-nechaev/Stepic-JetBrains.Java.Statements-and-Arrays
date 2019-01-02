import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int mark;
    int a = 0, b = 0, c = 0, d = 0;
    for (int i = scanner.nextInt(); i > 0; i--) {
      mark = scanner.nextInt();
      switch (mark) {
        case 5:
          a++;
          break;
        case 4:
          b++;
          break;
        case 3:
          c++;
          break;
        case 2:
          d++;
          break;
      }
    }
    System.out.println(d + " " + c + " " + b + " " + a + " ");
  }
}