import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String str = in.nextLine();
    StringBuilder s= new StringBuilder();
    int lastInd = str.length()-1 ;
    for (int i = 0; i < str.length(); i++) {
      s.append(str.charAt(lastInd));lastInd--;}
    if (str.equals(s.toString()) ) System.out.println("yes");
    else System.out.println("no");
  }
}