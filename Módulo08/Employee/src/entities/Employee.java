
package entities;

public class Employee {

    public String name;
    public double grosssalary;
    public int tax;

    public double netSalary() {
        return grosssalary - tax;
    }

    public void increaseSalary (double percentage) {
        grosssalary = grosssalary * percentage  / 100.0;
    }
    public String toString() {
        return "Employee: " + name + ", $ " + String.format("%.2f", netSalary());
    }
}