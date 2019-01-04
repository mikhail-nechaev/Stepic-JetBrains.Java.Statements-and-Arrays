import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    String max = "";
    String curr;

    while (scanner.hasNext()){
      curr = scanner.next();
      max = (curr.length() > max.length()) ? curr : max;
    }

    System.out.println(max);

  }
}