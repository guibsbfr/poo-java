package application;

import entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;


/* Exercício de fixação. Realizar aumento de um funcionário baseado no seu id, levando em consideração que o id não pode
repetido e caso o id exista, digite outro id e percorra a lista de novo */


public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many employees will be registered? ");
        int N = sc.nextInt();
        System.out.println();

        List<Employee> list = new ArrayList<>();

        // for utilizando a instanciação da classe Employee para guarda-los na lista employee.

        for (int i = 1; i <= N; i++) {
            System.out.println("Employee #" + i + ":");
            System.out.print("Id: ");
            Integer id = sc.nextInt();

            boolean same;
            do {
                same = false;
                for (Employee emp : list) {
                    if (id.equals(emp.getId())) {
                        same = true;
                        System.out.println("ERROR! This Id already exist");
                    }
                }
                if (same) {
                    System.out.print("Type another Id: ");
                    id = sc.nextInt();
                }
            } while (same);

            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Salary: ");
            Double salary = sc.nextDouble();
            System.out.println();

            Employee employee = new Employee(id, name, salary);
            list.add(employee);
        }

        System.out.print("Enter the employee Id that will have salary increase: ");
        int temp = sc.nextInt();

        // utilizei boolean por ainda não ter conhecimento em funções lambdas.

        boolean found = false;

        // futuramente utilizar lambda para melhorar o nivel da API.

        for (Employee emp : list) {
            if (temp == emp.getId()) {
                found = true;
                System.out.print("Enter the percentage: ");
                int percentage = sc.nextInt();

                emp.increaseSalary(percentage);
            }
        }
        if (!found) {
            System.out.println();
            System.out.print("This id does not exit!");
        }

        // percorrer lista com laço for each para mostrar cada funcionário registrado.

        System.out.println();
        System.out.println("List of employees: ");
        for (Employee x : list) {
            System.out.println(x);
        }

        sc.close();
    }
}