import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      String str = scanner.nextLine();
      int count = 1;
      StringBuilder newStr = new StringBuilder();
      for (int i = 0; i < str.length() - 1; i++) {
        if (str.charAt(i) == str.charAt(i+1)){
          count++;
        } else {
          newStr.append(str.charAt(i)).append(count);
          count = 1;
        }
      }
      newStr.append(str.charAt(str.length() - 1)).append(count);
      System.out.println(newStr);
    }
  }
}