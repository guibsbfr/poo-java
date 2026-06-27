
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many numbers will be typed? ");
        int N = sc.nextInt();

        int[] vect = new int[N];

        for (int i = 0; i < N; i++) {
            System.out.print("Type a number: ");
            vect[i] = sc.nextInt();
        }

        System.out.println("Negative numbers: ");
        for (int i = 0; i < N; i++) {
            if (vect[i] < 0) {
                System.out.println(vect[i]);
            }
        }

        sc.close();
    }
}