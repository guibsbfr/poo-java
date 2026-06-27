import java.util.Locale;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many numbers you will type? ");
        int N = sc.nextInt();

        double[] vect = new double[N];

        for (int i = 0; i < N; i++) {
            System.out.print("Type a number: ");
            vect[i] = sc.nextDouble();
        }

        int position = 0;
        double highest = vect[0];
        for (int i = 0; i < N; i++) {
            if (highest < vect[i]) {
                    highest = vect[i];
                    position = i;
            }
        }

        System.out.println();
        System.out.println("highest value = " + String.format("%.1f", highest));

        System.out.print("position of highest value = " + position);

        sc.close();
    }
}