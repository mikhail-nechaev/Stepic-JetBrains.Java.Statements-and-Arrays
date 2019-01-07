import java.util.Scanner;
public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String input = sc.nextLine();
    String newStr = "";
    char curChar = 0;
    for(int i=0; i<input.length(); i++)
    {
      if(curChar == input.charAt(i))
        continue;
      else
        curChar = input.charAt(i);
      int curCharCount = 1;
      for(int j = i+1; j<input.length(); j++)
      {
        if(input.charAt(j)!=curChar)
        {
          break;
        }
        curCharCount += 1;
      }
      newStr = newStr + curChar + curCharCount;
    }
    System.out.println(newStr);
  }
}