import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    int b = scanner.nextInt();
    int h = scanner.nextInt();
    String output;
    if (h < a ) output = "Deficiency";
    else if (h > b) output = "Excess";
    else output = "Normal";

    System.out.println(output);

  }
}