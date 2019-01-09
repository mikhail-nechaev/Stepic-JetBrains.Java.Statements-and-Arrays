import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    StringBuilder string = new StringBuilder();
    while (scanner.hasNext()) {
      string.append(scanner.next());
      string.append(" ");
    }
    String[] words = string.toString().split(" ");
    int maxLength = words[0].length();
    int index = 0;
    for (int i = 1; i < words.length; i++) {
      if (maxLength < words[i].length()) {
        index = i;
        maxLength = words[i].length();
      }
    }
    System.out.println(words[index]);
  }
}