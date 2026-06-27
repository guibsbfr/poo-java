import java.util.Locale;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many numbers will be typed? ");
        int N = sc.nextInt();

        double[] vect = new double[N];


        double sum = 0;
        for (int i = 0; i < N; i++) {
            System.out.print("Type a number: ");
            vect[i] = sc.nextDouble();
            sum = sum + vect[i];
        }

        System.out.print("VALORES = ");
        for (int i = 0; i < N; i++) {
            System.out.print(vect[i] + " ");
        }

        System.out.println("\nSUM = " +  String.format("%.2f", sum));

        double average = sum / N;

        System.out.println("AVERAGE = " + String.format("%.2f", average));


        sc.close();
    }
}