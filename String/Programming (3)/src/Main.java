import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    String str = scan.next().toLowerCase();

    double per = 0.0;

    for (int i = 0; i < str.length(); i++)
    {
      if (str.charAt(i) == 'c' || str.charAt(i) == 'g')
      {
        ++per;
      }
    }

    per /= str.length();
    per *= 100.0;

    System.out.print(per);


  }
}