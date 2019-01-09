import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int[] array = new int[length];

        for (int i = 0; i < length; i++) {
            array[i] = scanner.nextInt();
        }

        int max = array[0];
        int index = 0;

        for (int i = 1; i< length; i++){
            index = array[i] > max ? i : index;
            max = array[i] > max ? array[i] : max;

        }

        System.out.println(index);
    }
}
