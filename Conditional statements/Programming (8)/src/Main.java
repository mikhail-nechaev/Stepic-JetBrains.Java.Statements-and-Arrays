import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    String out;
    if (a < 1) out = "no army";
    else if (a <= 4) out = "few";
    else if (a <= 9) out = "several";
    else if (a <= 19) out = "pack";
    else if (a <= 49) out = "lots";
    else if (a <= 99) out = "horde";
    else if (a <= 249) out = "throng";
    else if (a <= 499) out = "swarm";
    else if (a <= 999) out = "zounds";
    else out = "legion";

    System.out.println(out);
  }
}