import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String word = scanner.next();
    word = word.toLowerCase();

    int c = 0;

    for (char ch: word.toCharArray()){
      if (ch == 'c' || ch ==  'g')
        c++;
    }

    System.out.println(100.0 * c / word.length());

  }
}