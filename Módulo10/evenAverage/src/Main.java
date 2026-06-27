
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many elements the vect will have? ");
        int N = sc.nextInt();

        int[] vect = new int[N];

        int sum = 0;
        int pairs = 0;
        for (int i = 0; i < N; i++) {
            System.out.print("Type a number: ");
            vect[i] = sc.nextInt();
            if (vect[i] % 2 == 0) {
                sum = sum + vect[i];
                pairs++;
            }
        }

        if (sum == 0) {
            System.out.println("Theres no have a even number");
        }
        else {
            int average = sum / pairs;
            System.out.print("Even average = " +  average);

        }

        sc.close();
    }
}