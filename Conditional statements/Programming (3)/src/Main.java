import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    StringBuilder a = new StringBuilder(scanner.next());

    while (a.length() != 4)
      a.insert(0, "0");

    StringBuilder b = new StringBuilder(a);
    b.reverse();

    if (a.toString().equals(b.toString())) System.out.println(1);
    else System.out.println(0);

  }}