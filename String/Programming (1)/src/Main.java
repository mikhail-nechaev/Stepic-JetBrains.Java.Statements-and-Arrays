import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      String str = scanner.nextLine();
      String strs[] = str.split( " ");
      String max = "";
      for (String strarr : strs) {
        if (strarr.length() > max.length()) {
          max = strarr;
        }
      }
      System.out.println(max);
    }
  }
}