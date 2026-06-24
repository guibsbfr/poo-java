package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Employee;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        Employee employee = new Employee();
        System.out.println("Name: ");
        employee.name = sc.nextLine();

        System.out.println();
        System.out.println("Gross Salary: ");
        employee.grosssalary = sc.nextDouble();

        System.out.println();
        System.out.println("Tax: ");
        employee.tax= sc.nextInt();

        System.out.println();
        System.out.println(employee.toString());

        System.out.println();
        System.out.print("Which percentage to increase salary? ");
        double percentage = sc.nextDouble();
        employee.increaseSalary(percentage);

        System.out.println();
        System.out.println("Updated data: " +  employee.toString());


        sc.close();

    }
}