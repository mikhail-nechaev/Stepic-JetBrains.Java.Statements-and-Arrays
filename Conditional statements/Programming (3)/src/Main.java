import java.util.Random;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    boolean flag = true;
    Scanner scanner = new Scanner(System.in);
    int in = scanner.nextInt();
    String str = "";
    while (in > 0) {
      str = str + (in % 10);
      in = in / 10;
    }
    while (str.length() < 4) {
      str += "0";
    }
    char[] x = str.toCharArray();
    for (int i = 0; i < str.length() / 2; i++) {
      if (x[i] != x[(str.length()-1) - i]) {
        flag = false;
      }
    }
    if (flag == true) {
      System.out.println("1");
    } else {
      System.out.println("3");
    }
  }
}