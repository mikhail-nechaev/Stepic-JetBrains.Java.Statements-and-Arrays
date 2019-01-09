import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String str = scanner.next().toLowerCase();
    double percentage = 0.0;

    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) == 'c' || str.charAt(i) == 'g')
        ++percentage;
    }

    percentage /= str.length();
    percentage *= 100.0;

    System.out.print(percentage);
  }
}