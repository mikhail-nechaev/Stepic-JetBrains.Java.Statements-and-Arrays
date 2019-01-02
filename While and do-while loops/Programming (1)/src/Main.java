import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int c = scanner.nextInt();
    int max = 0;
    int a;
    while (c != 0){
      a = scanner.nextInt();
      if (a % 4 == 0 && a > max)
        max = a;
      c--;
    }
    System.out.println(max);
  }
}