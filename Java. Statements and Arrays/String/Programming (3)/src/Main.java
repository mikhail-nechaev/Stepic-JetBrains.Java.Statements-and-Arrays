import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String str = in.nextLine();
    String s = str.toLowerCase();
    String [] strings = s.split("");
    double c=0.0;
    for (String string : strings) {
      if (string.equals("g") || string.equals("c")) c++;
    }
    System.out.println(c/str.length()*100.0);

  }
}