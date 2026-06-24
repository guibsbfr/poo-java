package application;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

import entities.Person;


public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many people will be typed? ");
        int N  = sc.nextInt();

        Person[] people = new Person[N];

        double sum = 0;
        for (int i = 0; i < N; i++){
            sc.nextLine();
            System.out.println("Data of person " + (i + 1) + ":");

            System.out.print("Name: ");
            String Name = sc.nextLine();

            System.out.print("Age: ");
            int Age = sc.nextInt();

            System.out.print("Height: ");
            double height = sc.nextDouble();
            sum = sum + height;

            people[i] = new Person(Name, Age, height);
        }

        double average = sum / N;

        System.out.println("Average height of people: " + String.format("%.2f", average));
        sum = 0.0;
        int under16 = 0;

        for  (int i = 0; i < N; i++){
            sum += people[i].heigth;

            if (people[i].heigth < under16) {
                under16++;
            }
        }

        System.out.println("Number of people under 16: " + under16);

        sc.close();
    }
}