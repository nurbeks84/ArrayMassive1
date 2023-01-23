import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int b = 1;
        while (number >= b) {
            if (b % 2 == 0) {
                System.out.print(b);

            } else {
                System.out.println();
            }
            b++;

        }


    }
}
