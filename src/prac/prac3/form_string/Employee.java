package prac.prac3.form_string;

public class Employee {
    private String fullname;
    private double salary = 0.0;
    public Employee(String fullname, double salary){
        this.fullname = fullname;
        this.salary = salary;
    }

    public String getFullname() {
        return fullname;
    }

    public double getSalary() {
        return salary;
    }
}
