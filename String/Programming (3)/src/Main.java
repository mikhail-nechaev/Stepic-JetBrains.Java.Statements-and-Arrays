import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    double counter = 0.0;
    Scanner sc = new Scanner(System.in);
    char[] input = sc.nextLine().toLowerCase().toCharArray();
    int size = input.length;
    for (int i=0; i<size; i++) {
      if ((input[i]=='g') || (input[i] == 'c'))
        counter++;
    }
    System.out.println(counter/size*100);
  }
}