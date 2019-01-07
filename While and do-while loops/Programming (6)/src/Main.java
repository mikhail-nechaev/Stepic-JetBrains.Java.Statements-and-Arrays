import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int start = sc.nextInt();
    while (start != 1) {
      System.out.print(start+" ");
      if (start % 2 == 0)
        start = start / 2;
      else
        start = start * 3 + 1;
    }
    System.out.print("1");
  }
}