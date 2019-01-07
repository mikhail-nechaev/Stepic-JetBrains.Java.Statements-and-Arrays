import java.math.BigInteger;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    String in = sc.nextLine();
    String [] inp = in.split(" ");
    BigInteger a = new BigInteger(inp[0]);
    BigInteger b = new BigInteger(inp[2]);
    switch (inp[1]) {
    case "+":
      System.out.println(a.add(b));
      break;
    case "-":
      System.out.println(a.subtract(b));
      break;
    case "/":
      if (b.intValue()==0)
        System.out.println("Division by 0!");
      else
        System.out.println(a.divide(b));
      break;
    case "*":
      System.out.println(a.multiply(b));
      break;
    default:
      System.out.println("Unknown operator");
    }
  }
}