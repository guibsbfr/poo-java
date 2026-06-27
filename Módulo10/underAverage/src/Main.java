import java.util.Locale;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many elements vect will have? ");
        int N = sc.nextInt();

        double[] vect = new double[N];

        for (int i = 0; i < N; i++) {
            System.out.print("Type a number: ");
            vect[i] = sc.nextDouble();
        }

        double sum = 0;
        for (int i = 0; i < N; i++) {
            sum = sum + vect[i];
        }

        double average = sum / N;
        System.out.println("Vect average = " + String.format("%.3f", average));

        System.out.println("Elements under average: ");
        for (int i = 0; i < N; i++) {
            if (vect[i] < average) {
                System.out.println(vect[i]);
            }
        }


        sc.close();
    }
}