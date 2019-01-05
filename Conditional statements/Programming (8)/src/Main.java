import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int i = in.nextInt();

    if (i >= 1000){
      System.out.println("legion");
      return;
    }
    if (i >= 500){
      System.out.println("zounds");
      return;
    }
    if (i >= 250){
      System.out.println("swarm");
      return;
    }
    if (i >= 100){
      System.out.println("throng");
      return;
    }
    if (i >= 50){
      System.out.println("horde");
      return;
    }
    if (i >= 20){
      System.out.println("lots");
      return;
    }
    if (i >= 10){
      System.out.println("pack");
      return;
    }
    if (i >= 5){
      System.out.println("several");
      return;
    }
    if (i >= 1){
      System.out.println("few");
      return;
    }
    System.out.println("no army");

  }
}