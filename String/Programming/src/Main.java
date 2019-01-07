import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String input = sc.nextLine();
    int number = Integer.parseInt(input);
    int first = number/1000;
    int second = number % 1000;
    int sum_f = 0;
    int sum_s = 0;
    for (int i=0; i<3; i++) {
      sum_f = sum_f+first%10;
      first = first / 10;
      sum_s = sum_s+second%10;
      second = second/10;
    }
    if (sum_f==sum_s)
      System.out.println("Lucky");
    else System.out.println("Regular");
  }
}