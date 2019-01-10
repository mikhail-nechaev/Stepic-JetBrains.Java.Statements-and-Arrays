import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String str = in.nextLine();
    String [] s = str.split(" ");
    int max =0,ind=0;
    for (int i = 0; i < s.length; i++) if (s[i].length() > max) {
      max = s[i].length();
      ind = i;
    }
    System.out.println(s[ind]);
  }
}