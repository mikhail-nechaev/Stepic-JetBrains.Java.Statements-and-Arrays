import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner in = new Scanner(System. in);
    String str = in.nextLine();
    char ch=str.charAt(0);
    int count=0;
    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) == ch) count++;
      else if (str.charAt(i) != ch){
        System.out.print(ch+""+count);
        ch = str.charAt(i);
        count=1;
      }
    }System.out.println(ch+""+count);
  }
}