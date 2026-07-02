package application;

import java.text.ParseException;
import java.util.Locale;
import java.util.Scanner;

import entities.Rent;

public class Main {
    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many rooms will be rented? ");
        int N = sc.nextInt();


        Rent[] vect = new Rent[10];

        for (int i = 1; i <= N; i++) {
            System.out.println("Rent #" + i + ":");
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            System.out.print("room: ");
            int number = sc.nextInt();
            System.out.println();
            vect[number] = new Rent(name, email);
        }

        // Sysout chamou o toString com o metodo object para receber uma representação em String do objeto.

        System.out.println();
        System.out.println("Busy rooms: ");
        for (int i = 0; i < 10; i++) {
            if (vect[i] != null) {
                System.out.println(i + ": " + vect[i]);
            }
        }

        sc.close();
    }
}