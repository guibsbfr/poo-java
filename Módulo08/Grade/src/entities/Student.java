package entities;

public class Student {
    public String name;
    public double primeiraNota;
    public double segundaNota;
    public double terceiraNota;

    public double totalGrade() {
        return primeiraNota +  segundaNota + terceiraNota;
    }
    public double missingPoints() {
        return 60 - totalGrade();
    }

    public boolean isApproved() {
        return totalGrade() >= 60.0;
    }
}
