import java.math.BigInteger;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    String input = scan.nextLine();

    String[] input_mass = input.split("\\s");

    BigInteger num1 = new BigInteger(input_mass[0]);
    String oper = input_mass[1];
    BigInteger num2 = new BigInteger(input_mass[2]);


    if (num2.intValue() == 0 && oper.equals("/"))
    {
      System.out.print("Division by 0!");
    }
    else
    {
      switch (oper)
      {
        case "+": System.out.print(num1.add(num2));
        break;
        case "-": System.out.print(num1.subtract(num2));
        break;
        case "/": System.out.print(num1.divide(num2));
        break;
        case "*": System.out.print(num1.multiply(num2));
        break;
        default: System.out.print("Unknown operator");
      }
    }
  }
}