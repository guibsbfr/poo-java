package application;

import entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        Student student = new Student();
        System.out.println("Enter your Name: ");
        student.name = sc.nextLine();

        System.out.print("Enter first trimester grade: ");
        student.primeiraNota = sc.nextDouble();

        System.out.print("Enter second trimester grade: ");
        student.segundaNota = sc.nextDouble();

        System.out.print("Enter third trimester grade: ");
        student.terceiraNota = sc.nextDouble();

        if (student.isApproved()) {
            System.out.println("Student is approved");
        }
        else {
            System.out.println("Student is not approved");
        }

        sc.close();
    }
}