import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      String str = scanner.nextLine();
      int i = 0;
      int j = str.length() - 1;
      while (i < str.length() / 2 + 1 && j > str.length() / 2 - 1) {
        if (str.charAt(i) != str.charAt(j)) {
          System.out.println("no");
          return;
        }
        i++;
        j--;
      }
      System.out.println("yes");
    }
  }
}