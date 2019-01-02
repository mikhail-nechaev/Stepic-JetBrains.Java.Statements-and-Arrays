import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String str = scanner.nextLine();
    StringBuilder newStr = new StringBuilder();
    char t = 0;

    for (int i = 0; i < str.length(); i++) {
      if (t == str.charAt(i)) continue;
      else
        t = str.charAt(i);

      int charCount = 1;

      for (int j = i + 1; j < str.length(); j++) {
        if (str.charAt(j) != t) break;
        charCount += 1;
      }
      newStr.append(t).append(charCount);
    }

    System.out.println(newStr);
  }
}