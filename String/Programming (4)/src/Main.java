import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    //put your code here
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    String newStr = "";
    char tempChar = 0;
    //int charCount = 0;
    for (int i = 0; i < str.length(); i++) {
      if (tempChar == str.charAt(i)) {
        continue;
      } else {
        tempChar = str.charAt(i);
      }
      int charCount = 1;
      for (int j = i + 1; j < str.length(); j++) {
        if (str.charAt(j) != tempChar) {
          break;
        }
        charCount += 1;
      }
      newStr = newStr + tempChar + charCount;
    }
    System.out.println(newStr);
  }
}