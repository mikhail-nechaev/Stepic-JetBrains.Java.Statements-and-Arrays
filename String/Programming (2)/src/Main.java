import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    boolean flag = true;
    Scanner sc = new Scanner(System.in);
    String input = sc.nextLine();
    for (int i=0; i<input.length()/2; i++) {
      if (input.charAt(i) != input.charAt(input.length() - i - 1))
        flag = false;
    }
    if (flag == true)
      System.out.println("yes");
    else
      System.out.println("no");
  }
}