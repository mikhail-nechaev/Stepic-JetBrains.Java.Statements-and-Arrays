import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String s = scanner.nextLine();

            String[] a = s.split(" ");
            s = "";
            for (String b : a){
                if (b.length() > s.length()){
                    s = b;
                }
            }

            System.out.println(s);

        }
    }
}