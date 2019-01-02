import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    String s = new Scanner(System.in).next();
    int c = 0;

    for (int i = 0; i < s.length(); i++)
      if (s.charAt(i) == 'c' || s.charAt(i) == 'g')
        c++;

    System.out.println(c/s.length() * 100);
  }
}